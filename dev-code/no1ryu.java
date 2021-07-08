import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] result = new int[p.length];
        for(int i=0;i<p.length;i++){
            int x = i+1;
            int y=-1;
            int px = -1;
            for(int k=0;k<p.length;k++){
                if(x==p[k]){
                   y=k;
                }
            }
            for(int l=0;l<p.length;l++){
                if(y+1==p[l]){
                    px=p[l];
                }
            }
            for(int m=0;m<p.length;m++){
                if(px==p[m]){
                    result[i]=m+1;
                }
            }


        }
        return result;
    }

}
