import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        Map<Integer, Integer> p1 = new HashMap<>();
        for (int i = 0; i < p.length; i++) {
            p1.put(p[i], i+1);
        }
        int[] p2 = new int[p.length];

        for (int i = 0; i < p.length; i++) {
            p2[i] = p1.get(p1.get(i+1));
        }
        return p2;

    }

}
