import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int len = p.length;
        int[] result = new int[len];

        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < len; i++) {
            indexMap.put(p[i], i + 1);
        }

        for (int i = 0; i < len; i++) {
            result[i] = indexMap.get(indexMap.get(i + 1));
        }

        return result;

    }

}
