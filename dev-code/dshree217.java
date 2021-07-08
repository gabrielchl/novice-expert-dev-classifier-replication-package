import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        int n = p.length;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            h.put(p[i],i+1);
        }
        for(int i=0;i<n;i++){
            int temp = h.get(i+1);
            res[i]=h.get(temp);

        }
        return res;
    }

}
