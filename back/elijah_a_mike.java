import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static Map<Integer, Integer> kv = new HashMap<>();

    static int[] getAnswers(int i, int[] p) {
      if(i >= p.length) {
        return new int[p.length];
      }

      int x = i + 1;
      kv.put(p[i], x);

      int[] a = getAnswers(i +1, p);

      a[i] = kv.get(kv.get(x));
      return a;
    }

    static int[] permutationEquation(int[] p) {
      return getAnswers(0, p);
    }

}
