import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] a = new int[p.length];
        for (int i=1; i<=p.length; i++){
            int j=0;
            while(j<p.length){
                if(p[j]==i){break;}
                else{j++;}
            }
            int k=0;
            while(k<p.length){
                if(p[k]==j+1){break;}
                else{k++;}
            }
            a[i-1]=k+1;
        }
        return a;
    }

}
