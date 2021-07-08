import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int p1 = 0;
        int x = 0;
        ArrayList<Integer> x1 =  new ArrayList<Integer>();
        for(int j=1; j<=p.length; j++){
        for(int i=0; i<p.length; i++){
            if(p[i] == j){
                p1 = i+1;
            }
        }
        for(int k=0; k<p.length; k++){
            if(p[k] == p1){
                x = k+1;
                x1.add(x);
            }
        }
        }
        int[] ar = new int[p.length];
        for(int i=0; i<p.length; i++)
        ar[i] = x1.get(i);
        return ar;
    }

}
