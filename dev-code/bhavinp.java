import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        Map<Integer, Integer> valToIndex = new HashMap<Integer, Integer>();
        for (int i = 0; i < p.length; i++) {
            valToIndex.put(p[i], i + 1);
        }
        int ret[] = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            int x = i+1;
            int indx = valToIndex.get(x);
            ret[i] = valToIndex.get(indx);
        }
        return ret;
    }

}
