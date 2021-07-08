import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < p.length; i++) {
            map.put(p[i], i+1);
        }
        int[] dup = new int[p.length];
        for(int i = 0; i < p.length; i++) {
            dup[i] = map.get(map.get(i+1));
            System.out.println("i: " + i+1 + " dup: " + dup[i]);
        }

        return dup;

    }

}
