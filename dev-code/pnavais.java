import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        Map<Integer, Integer> posMap = new LinkedHashMap<>();

        for (int i=0; i<p.length; i++) {
            posMap.put(p[i], i+1);
        }

        int[] res = new int[p.length];
        for (int i=0; i<p.length; i++) {
            int firstPos = posMap.get(i+1);
            int secondPos = posMap.get(firstPos);
            res[i] = secondPos;
        }

        return res;
    }

}
