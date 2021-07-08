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
        for(int i = 0 ; i < p.length; i++){
            map.put(p[i], i + 1);
        }
        //System.out.println(map);
        int[] ret = new int[p.length];
        for(int i = 0; i < p.length; i++){
            int p1 = map.get(i + 1);
            int p2 = map.get(p1);
            ret[i] = p2 ;
        }
        return ret;
    }

}
