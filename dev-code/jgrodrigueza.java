import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] ret = new int[p.length];
        List<Integer> list = new ArrayList<Integer>();
        list.add(Integer.MIN_VALUE);
        list.addAll(Arrays.stream(p).boxed().collect(Collectors.toList()));
        List<Integer> ordered = new ArrayList<Integer>();
        ordered.add(Integer.MIN_VALUE);
        ordered.addAll(Arrays.stream(p).boxed().collect(Collectors.toList()));
        Collections.sort(ordered);
        int pos = Integer.MIN_VALUE;
        for (int num = 1; num < ordered.size(); num++) {
            pos = list.indexOf(num);
            ret[num - 1] = list.indexOf(pos);
        }
        return ret;
    }

}
