import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        Map<Integer,Integer> valueMap = new HashMap<>();

        for(int i=0;i<p.length;i++) {
            valueMap.put(p[i],i+1);
        }
        int[] res = new int[p.length];
        for(int i=1;i<=p.length;i++) {
            int pos = valueMap.get(i);
            res[i-1] = valueMap.get(pos);
        }
        return res;
    }

}
