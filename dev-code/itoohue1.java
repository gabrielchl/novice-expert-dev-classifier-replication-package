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
        int[] ans = new int[len];
        Map<Integer, Integer> first = new HashMap();
        // Map<Integer, Integer> second = new HashMap();
        for(int i = 0; i < len; i++) {
          first.put(p[i], i+1);
        //   second.put(i+1, p[i]);
        }

        for(int i = 1; i<=len; i++) {
          int x = first.get(i);
          int y = first.get(x);
          ans[i-1] = y;
        }


        return ans;
    }

}
