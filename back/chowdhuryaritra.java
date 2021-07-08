import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        List<Integer> data = new ArrayList<Integer>();
        int n = p.length;

        for(int i =0;i<n ;i++){
            data.add(p[i]);
        }

        int res [] = new int[n];

        for(int i = 1 ; i<=n ;i++){
            int index = data.indexOf(i);
            int op = data.indexOf(index+1);
            res[i-1] = op+1;
        }
        return res;
    }

}
