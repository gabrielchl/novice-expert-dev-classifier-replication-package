import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        int[] p2= new int[p.length];

        for(int j=0;j<p.length;j++){
            p2[j]+=p[j];
        }
        Arrays.sort(p2);
        int[] p4= arraySwap(arraySwap(p,p2),p);
        return p4;
    }
    private static int[] arraySwap(int[] p, int[] p2) {
        int[] p3 = new int[p.length];
        for(int i=0;i<p.length;i++){
            for(int j=0;j<p2.length;j++){
                if(p[i]==p2[j]){
                    p3[i]= p[p2[j]-1];
                }
            }
        }
        return p3;
    }

}
