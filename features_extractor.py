import javalang
import re


def ratio_calc(a, b):
    if not a and not b:
        return 0.5
    elif not a:
        return 0.0
    elif not b:
        return 1.0
    else:
        return a / (a + b)


def extract(filename):
    file = open(filename).read()
    lines = file.split('\n')
    tree = javalang.parse.parse(file)

    # num_lines: number of lines (including blank lines)
    num_lines = len(lines)

    # empty_lines_ratio: ratio of empty lines in all lines
    empty_lines = sum(1 for line in lines if not line.strip())
    empty_lines_ratio = ratio_calc(empty_lines, num_lines)

    # avg_len_lines: average length of non-empty lines
    avg_len_lines = len(file) / (num_lines - empty_lines_ratio)

    # num_line_comments: number of inline comments
    # avg_len_line_comments: average length of all inline comments
    num_line_comments = file.count('//')
    if not num_line_comments:
        avg_len_line_comments = 0
    else:
        len_line_comments = 0
        for line in lines:
            if '//' in line:
                [_, line_comment] = line.split('//')
                len_line_comments += len(line_comment)
        avg_len_line_comments = len_line_comments / num_line_comments

    # num_block_comments: number of block comments
    # avg_len_block_comments: average length of all block comments
    block_comments = re.findall(r'\/\*(.*)\*\/', file, flags=re.S)
    num_block_comments = len(block_comments)
    len_block_comments = sum(len(block_comment)
                             for block_comment in block_comments)
    if not num_block_comments:
        avg_len_block_comments = 0
    else:
        avg_len_block_comments = len_block_comments / num_block_comments

    # num_variables: number of variables
    # avg_len_variables: average length of all variables
    variables = ([node.name for path, node
                  in tree.filter(javalang.tree.VariableDeclarator)])
    num_variables = len(variables)
    if num_variables:
        avg_len_variables = len(''.join(variables)) / num_variables
    else:
        avg_len_variables = 0

    # num_<if|for|do|while|switch|case>: number of such tokens
    num_if = len(list(tree.filter(javalang.tree.IfStatement)))
    num_for = len(list(tree.filter(javalang.tree.ForStatement)))
    num_do = len(list(tree.filter(javalang.tree.DoStatement)))
    num_while = len(list(tree.filter(javalang.tree.WhileStatement)))
    num_switch = len(list(tree.filter(javalang.tree.SwitchStatement)))
    num_cast = len(list(tree.filter(javalang.tree.Cast)))

    # cond_space_ratio: no space "if(" : space "if ("
    cond_no_space = re.findall(r'(?:(?:if)|(?:for)|(?:while)|(?:do))\(', file)
    cond_space = re.findall(r'(?:(?:if)|(?:for)|(?:while)|(?:do)) \(', file)
    cond_space_ratio = ratio_calc(len(cond_no_space), len(cond_space))

    # braket_line_ratio: same line "){ or ) {" : new line ")\n{"
    bracket_same_line = re.findall(r'\) *\t*\{', file)
    bracket_new_line = re.findall(r'\) *\t*\n *\t*\{', file)
    bracket_line_ratio = ratio_calc(len(bracket_same_line),
                                    len(bracket_new_line))

    # cc: cyclomatic complexity by 1 + number of branches
    # (not the best implementation for && and ||, but works in this dataset)
    num_case = len(list(tree.filter(javalang.tree.SwitchStatementCase)))
    num_catch = len(list(tree.filter(javalang.tree.SwitchStatementCase)))
    num_and = file.count('&&')
    num_or = file.count('||')
    cc = (1 + num_if + num_case + num_do + num_while + num_for + num_catch +
          num_and + num_or)

    return [
        num_lines,
        empty_lines_ratio,
        avg_len_lines,
        num_line_comments,
        avg_len_line_comments,
        num_block_comments,
        avg_len_block_comments,
        num_variables,
        avg_len_variables,
        num_if,
        num_for,
        num_do,
        num_while,
        num_switch,
        num_cast,
        cond_space_ratio,
        bracket_line_ratio,
        cc
    ]


if __name__ == '__main__':
    print('features_extractor.py is designed to be imported as a function.')
