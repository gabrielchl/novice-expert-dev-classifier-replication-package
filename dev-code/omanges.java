import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int n = p.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
            map.put(p[i], i+1);
        }
        int[] ans = new int[n];

        for(int i=0;i<n;i++){
            int p1 = map.get(i+1);
            int p2 = map.get(p1);
            ans[i]=p2;
        }
        return ans;
    }

}
