import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for(int i=0; i<p.length; i++) {
            map.put(p[i], i+1);
        }

        int[] r = new int[p.length];

        for(int i=0; i<p.length; i++) {
            r[i] = map.get(map.get(i+1));
        }

        return r;

    }

}
