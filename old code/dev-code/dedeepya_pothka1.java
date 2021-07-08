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
        int[] res = new int[len];

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < len ; i++) {
            map.put(p[i], i+1);
        }

        System.out.println(map);

        for(int i = 0; i < len; i++) {
            int val = i+1;

            int x = map.get(val);
            int y = map.get(x);

            res[i] = y;
        }
        return res;
    }

}
