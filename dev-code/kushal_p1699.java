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

        for(int i=1; i<=p.length; i++){
            map.put(p[i-1], i);
        }

        int res[] = new int[p.length];

        for(int i=1; i<=p.length; i++){
            int key = map.get(i);
            res[i-1] = map.get(key);
        }

        return res;
    }

}
