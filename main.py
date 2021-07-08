from trainer import train

while True:
    try:
        exp_num = int(input('Enter experiment number (0 - 6) to run: '))
    except ValueError:
        print('Enter a number from 0 - 6.')
        continue

    if exp_num == 0:
        print('EXP0: Original code (no halstead, no complexity, no style '
              'features, no normalizer)')
        train(True, True, None, False, False, None, 0)

    elif exp_num == 1:
        print('EXP1: Base model (base, no halstead, no complexity, no style '
              'features, no normalizer)')
        train(False, True, None, False, False, None, 1)

    elif exp_num == 2:
        print('# EXP2: Halstead only (no base, halstead, no complexity, no '
              'style features, # no normalizer) + Base with Halstead (base, '
              'halstead, no complexity, no style features, no normalizer)')
        train(False, False, True, False, False, None, '2-1')
        train(False, True, True, False, False, None, '2-2')

    elif exp_num == 3:
        print('EXP3: Complexity (base, no halstead, complexity, no style '
              'features, # no normalizer)')
        train(False, True, None, True, False, None, 3)

    elif exp_num == 4:
        print('EXP4: Style features (base, no halstead, no complexity, style '
              'features, no normalizer)')
        train(False, True, None, False, True, None, 4)

    elif exp_num == 5:
        print('EXP5: Normalization (base, no halstead, no complexity, no '
              'style features, min-max scaler + standard scaler)')
        train(False, True, None, False, False, 'minmax', '5-1')
        train(False, True, None, False, False, 'standard', '5-2')

    elif exp_num == 6:
        print('EXP6: Final (base, no halstead, complexity, style '
              'features, standard scaler)')
        train(False, True, None, True, True, 'standard', 6)

    else:
        print('Enter a number from 0 - 6.')
        continue
