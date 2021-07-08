import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < p.length; i++) {
            map.put(p[i], i + 1);
        }

        int[] result = new int[p.length];

        for (int i = 0; i < p.length; i++) {
            int j = map.get(i + 1);
            int k = map.get(j);
            result[i] = k;
        }

        return result;
    }

}
