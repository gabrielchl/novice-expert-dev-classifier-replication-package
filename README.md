# Novice and Expert Dev Classification Paper Replication Package

This is a repository that holds original data and code used in the paper for replication, verification and further study purposes.

## Structure

`dev-code/` and `dev-code-original/` - Developer's code used to train the models (dev-code contains code with "original code" removed)

`Halstead-Complexity-Measures/` - A Java program developed by [Ahmed A. Metwally](https://github.com/aametwally/Halstead-Complexity-Measures) that extracts halstead metrics from a piece of Java code. Modified to export values to a CSV file instead of printing to standard output.

`novice_usernames.txt` and `expert_usernames.txt` - Text files containing a list of novice and expert usernames, to label the code in `dev-code/` and `dev-code-original/`.

`features_extractor.py` - Extracts all features (except halstead metrics, which have to be obtained through the separate program mentioned above).

`trainer.py` - Trains all models using the features and labels provided.

`main.py` - The main entry point of this replication package, providing a command line interface for the user to select experiments to run.

`halstead_values.csv` - The file holding the Halstead metrics values, generated by the above entioned program.

## Usage

### Halstead Metrics

This paper uses an external Java program developed by [Ahmed A. Metwally](https://github.com/aametwally/Halstead-Complexity-Measures) to extract Halstead metrics. The program was modified to export the Halstead volume, difficulty and effort values of all code files in a directory to a CSV file instead of printing to standard output.

The trainer reads the file generated above (`halstead_metrics.csv`) to obtain Halstead metrics.

To execute the modified program:

1. `cd Halstead-Complexity-Measures`
2. `gradle build`
3. `gradle execute -Parg1="<path_to_this_package>/dev-code" -Parg2="<path_to_this_package>/dev-code-original"`

### Model Training

1. Generate the Halstead metrics file, if needed, by following the above instructions
2. Install dependencies through pip
3. `python3 main.py`
4. Follow on-screen prompts to replicate experiments.
