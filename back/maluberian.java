import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] ret = new int[p.length];
        HashMap<Integer, Integer> y = new HashMap<>();

        for(int i=0; i<p.length; i++) {
            y.put(p[i], i);
        }

        for(int i=1; i<=p.length; i++) {
            int eval = y.get(i) + 1;
            ret[i-1] = y.get(eval) + 1;
        }

        return ret;
    }

}
