from features_extractor import extract
import numpy as np
import os
import math
import csv

from matplotlib import pyplot
from sklearn.model_selection import cross_validate
from sklearn.model_selection import StratifiedKFold
from sklearn.linear_model import LogisticRegression
from sklearn.tree import DecisionTreeClassifier
from sklearn.neighbors import KNeighborsClassifier
from sklearn.discriminant_analysis import LinearDiscriminantAnalysis
from sklearn.naive_bayes import GaussianNB
from sklearn.svm import SVC
from sklearn.ensemble import RandomForestClassifier
from sklearn.neural_network import MLPClassifier
from sklearn.preprocessing import MinMaxScaler, StandardScaler
from sklearn.metrics import make_scorer, matthews_corrcoef
import joblib
import javalang


def file_to_list(filename):
    return open(filename).read().split('\n')


def set_box_color(bp, color):
    pyplot.setp(bp['boxes'], color=color)
    pyplot.setp(bp['whiskers'], color=color)
    pyplot.setp(bp['caps'], color=color)
    pyplot.setp(bp['medians'], color=color)
    pyplot.setp(bp['fliers'], color=color)


def train(original=False, base=True, halstead_import=None, complexity=True,
          style_features=False, normalizer=None, exp_num=-1):
    if original:
        filenames = sorted(os.listdir('./dev-code-original'))
    else:
        filenames = sorted(os.listdir('./dev-code'))
    novices = file_to_list('./novice_usernames.txt')
    experts = file_to_list('./expert_usernames.txt')
    os.makedirs('results/{}'.format(exp_num), exist_ok=True)

    # #####
    # Sort out what features to include based on the function arguments.
    # #####

    feature_labels = [
        'num_lines',
        'empty_lines_ratio',
        'avg_len_lines',
        'num_line_com',
        'avg_len_line_com',
        'num_block_com',
        'avg_len_block_com',
        'num_variables',
        'avg_len_variables',
        'num_if',
        'num_for',
        'num_do',
        'num_while',
        'num_switch',
        'num_cast',
        'cond_space_ratio',
        'bracket_line_ratio',
        'cc',
        'halstead_volume',
        'halstead_difficulty',
        'halstead_effort'
    ]

    disabled_features = []

    if not base:
        disabled_features.append('num_lines')
        disabled_features.append('empty_lines_ratio')
        disabled_features.append('avg_len_lines')
        disabled_features.append('num_line_com')
        disabled_features.append('avg_len_line_com')
        disabled_features.append('num_block_com')
        disabled_features.append('avg_len_block_com')
        disabled_features.append('num_variables')
        disabled_features.append('avg_len_variables')
        disabled_features.append('num_if')
        disabled_features.append('num_for')
        disabled_features.append('num_do')
        disabled_features.append('num_while')
        disabled_features.append('num_switch')
        disabled_features.append('num_cast')

    if not halstead_import:
        disabled_features.append('halstead_volume')
        disabled_features.append('halstead_difficulty')
        disabled_features.append('halstead_effort')
    else:
        # Load csv, import to dict (mapping username to array of values)
        halstead_values = {}
        with open('halstead_values.csv') as csv_file:
            csv_reader = csv.reader(csv_file)
            for row in csv_reader:
                halstead_values[row[0]] = [float(row[1]), float(row[2]),
                                           float(row[3])]

    if not complexity:
        disabled_features.append('cc')

    if not style_features:
        disabled_features.append('cond_space_ratio')
        disabled_features.append('bracket_line_ratio')

    active_features = [i for i, label in enumerate(feature_labels)
                       if label not in disabled_features]
    active_feature_labels = [label for i, label in enumerate(feature_labels)
                             if label not in disabled_features]

    print('\nDisabled features:')
    print(disabled_features)

    print('\nActive features:')
    print(active_feature_labels)

    # #####
    # Read each file, extrct features to construct the dataset
    # #####

    dataset_array = []

    for filename in filenames:
        try:
            if original:
                extracted_features = extract('./dev-code-original/{}'.format(
                    filename))
            else:
                extracted_features = extract('./dev-code/{}'.format(filename))

            if halstead_import:
                extracted_features.extend(
                    halstead_values[filename.replace('.java', '')])

            if filename.replace('.java', '') in novices:
                extracted_features.append(0)
            elif filename.replace('.java', '') in experts:
                extracted_features.append(1)
            else:
                print('{} is not in either novice or expert namelist.'
                      .format(filename))
                continue
            dataset_array.append(extracted_features)
        except javalang.parser.JavaSyntaxError:
            exit('Failed to parse {}'.format(filename))

    dataset = np.array(dataset_array)
    x = dataset[:, active_features]
    y = dataset[:, -1]

    # #####
    # Basic dataset analysis
    # #####

    dataset_min = np.min(x, axis=0)
    dataset_q1 = np.percentile(x, 25, axis=0)
    dataset_median = np.median(x, axis=0)
    dataset_q3 = np.percentile(x, 75, axis=0)
    dataset_max = np.max(x, axis=0)

    dataset_novice_mean = np.mean([x for i, x in enumerate(x) if y[i] == 0],
                                  axis=0)
    dataset_expert_mean = np.mean([x for i, x in enumerate(x) if y[i] == 1],
                                  axis=0)

    dataset_metrics = np.column_stack((dataset_min, dataset_q1, dataset_median,
                                       dataset_q3, dataset_max,
                                       dataset_novice_mean,
                                       dataset_expert_mean))

    dataset_metrics = np.c_[np.array(active_feature_labels),
                            np.around(dataset_metrics, 5)]
    print('\nFeature values statistics (min, q1, median, q3, max, novice mean'
          ', expert mean)')
    print(dataset_metrics)
    np.savetxt('results/{}/dataset_metrics.csv'.format(exp_num),
               dataset_metrics,
               delimiter=',',
               fmt='%.18s')
    np.savetxt('results/{}/dataset.csv'.format(exp_num),
               np.r_[
                np.column_stack(active_feature_labels + ['class']),
                np.c_[x, y]
               ],
               delimiter=',',
               fmt='%.18s')

    # Normalize X if opted so
    if normalizer == 'minmax':
        scaler = MinMaxScaler()
        x = scaler.fit_transform(x)
    elif normalizer == 'standard':
        scaler = StandardScaler()
        x = scaler.fit_transform(x)

    # #####
    # Graph to show feature values grouped by classification
    # #####

    fig = pyplot.figure()
    fig.subplots_adjust(hspace=0.2, wspace=0.4)
    fig.suptitle('Direct Comparison of Features Extracted Against '
                 'Classification in Dataset')
    fig.tight_layout()
    for i in range(len(active_feature_labels)):
        ax = fig.add_subplot(2, math.ceil(len(active_features) / 2), i + 1)
        ax.title.set_text(active_feature_labels[i])
        ax.boxplot([[j[i] for j in dataset_array if j[-1] == 0],
                    [j[i] for j in dataset_array if j[-1] == 1]],
                   labels=[0, 1])
        ax.set_xlabel('Classification')
        ax.set_ylabel('Feature values')
    fig.set_size_inches((20, 11))
    pyplot.subplots_adjust(left=0.05, right=0.96, bottom=0.07, wspace=0.81,
                           hspace=0.27)
    pyplot.savefig('results/{}/features_correlation.png'.format(exp_num),
                   dpi=200)
    pyplot.show()

    # #####
    # Create all models to prepare for training
    # #####

    models = []
    models.append(('LR', LogisticRegression(solver='liblinear',
                                            multi_class='ovr')))
    models.append(('LDA', LinearDiscriminantAnalysis()))
    models.append(('KNN', KNeighborsClassifier()))
    models.append(('CART', DecisionTreeClassifier(random_state=0)))
    models.append(('NB', GaussianNB()))
    models.append(('SVM Lin', SVC(kernel='linear')))
    models.append(('SVM Pol', SVC(kernel='poly')))
    models.append(('SVM RBF', SVC(kernel='rbf')))
    models.append(('MLP', MLPClassifier(
        solver='lbfgs', alpha=1e-5, hidden_layer_sizes=(7, 7),
        random_state=0, max_iter=2000)))
    models.append(('RF', RandomForestClassifier(n_estimators=100,
                                                random_state=0)))

    names = []
    accuracy_results = []
    f1_results = []
    mcc_results = []
    mcc_scorer = make_scorer(matthews_corrcoef)

    # #####
    # Train, evaluate and store the result of each model in the results array.
    # #####

    for name, model in models:
        names.append(name)

        kfold = StratifiedKFold(n_splits=10, random_state=1, shuffle=True)
        cv_results = cross_validate(model, x, y, cv=kfold,
                                    scoring={
                                        'accuracy': 'accuracy',
                                        'f1': 'f1',
                                        'mcc': mcc_scorer
                                    },
                                    return_estimator=True)
        # print(cv_results['test_score'])
        # print(cv_results)
        accuracy_results.append(cv_results['test_accuracy'])
        f1_results.append(cv_results['test_f1'])
        mcc_results.append(cv_results['test_mcc'])

        if name == 'LR':
            coefs = []
            for model in cv_results['estimator']:
                coefs.append(model.coef_[0])

            # joblib.dump(cv_results['estimator'][-1], "model.sav")

            coefs = np.array(coefs)
            # print(coefs.mean(axis=0))

            pyplot.boxplot(coefs, labels=active_feature_labels)
            pyplot.xticks(rotation='vertical')
            pyplot.title('LR Model Coefficients')
            pyplot.ylim(-1, 1)
            pyplot.grid()
            pyplot.show()

            # export model to file
            # model.fit(x_train, y_train)
            # joblib.dump(model, "model.sav")

    print('\nModel Accuracies: (Average and Standard Deviation)')
    for index, result in enumerate(accuracy_results):
        print('{}: {} ({})'.format(names[index], result.mean(), result.std()))

    print('\nModel F1 Values: (Average and Standard Deviation)')
    for index, result in enumerate(f1_results):
        print('{}: {} ({})'.format(names[index], result.mean(), result.std()))

    print('\nModel MCC Values: (Average and Standard Deviation)')
    for index, result in enumerate(mcc_results):
        print('{}: {} ({})'.format(names[index], result.mean(), result.std()))

    # #####
    # Save and show model comparison
    # #####

    np.savetxt('results/{}/model_cross_val_scores.csv'.format(exp_num),
               np.flipud(np.rot90(np.array([
                   names,
                   [result.mean() for result in accuracy_results],
                   [result.std() for result in accuracy_results],
                   [result.mean() for result in f1_results],
                   [result.std() for result in f1_results],
                   [result.mean() for result in mcc_results],
                   [result.std() for result in mcc_results]
               ]))),
               delimiter=',',
               fmt='%.18s')

    fig = pyplot.figure()
    ax = pyplot.axes()
    accuracy_plot = pyplot.boxplot(accuracy_results, positions=range(1, 4 * len(accuracy_results) + 1, 4), flierprops={'markeredgecolor':'red'})
    f1_plot = pyplot.boxplot(f1_results, positions=range(2, 4 * len(accuracy_results) + 2, 4), flierprops={'markeredgecolor':'green'})
    mcc_plot = pyplot.boxplot([(mcc+1)/2 for mcc in mcc_results], positions=range(3, 4 * len(accuracy_results) + 3, 4), flierprops={'markeredgecolor':'blue'})
    set_box_color(accuracy_plot, 'red')
    set_box_color(f1_plot, 'green')
    set_box_color(mcc_plot, 'blue')
    pyplot.plot([], c='red', label='Accuracy')
    pyplot.plot([], c='green', label='F1 Value')
    pyplot.plot([], c='blue', label='MCC Value (mapped to [0,1] range)')
    pyplot.legend()
    pyplot.title('Cross Validation Scores of All Models (K Fold, 10 Splits)')
    pyplot.ylim(0, 1)
    pyplot.grid()
    ax.set_ylabel('Values')
    ax.set_xlabel('Models')
    ax.set_xticks(range(2, 4 * len(accuracy_results) + 2, 4))
    ax.set_xticklabels(names)
    fig.set_size_inches((10, 8))
    pyplot.subplots_adjust(left=0.085, right=0.96, top=0.9, bottom=0.09)
    pyplot.savefig('results/{}/model_cross_val_scores.png'.format(exp_num),
                   dpi=200)
    pyplot.show()

    # pyplot.boxplot(f1_results, labels=names)
    # pyplot.title('Model F1 Value Comparison (K Fold, 10 Splits)')
    # pyplot.ylim(0, 1)
    # pyplot.grid()
    # pyplot.show()
    #
    # pyplot.boxplot(mcc_results, labels=names)
    # pyplot.title('Model MCC Value Comparison (K Fold, 10 Splits)')
    # pyplot.ylim(-1, 1)
    # pyplot.grid()
    # pyplot.show()
