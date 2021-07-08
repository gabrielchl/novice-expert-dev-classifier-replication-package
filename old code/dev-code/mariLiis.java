import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        List<Integer> theList = Arrays.stream(p).boxed().collect(Collectors.toList());
        int[] y = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            int inter = theList.indexOf(i+1) + 1;
            y[i] = theList.indexOf(inter) + 1;
        }
        return y;
    }

}
