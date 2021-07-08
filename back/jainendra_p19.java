import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int len = p.length;
        int[] y = new int[len];
        int[] inter = new int[len+1];
        for(int j = 1;j<=len;j++){
            for(int k=0;k<len;k++){
                if(j == p[k]){
                    inter[j] = k+1;
                }
            }
        }
        for(int i = 1;i<=len;i++){
            System.out.println(inter[i]);
        }
        for(int j = 1;j<=len;j++){
            for(int k=1;k<=len;k++){
                if(p[k-1] ==inter[j]){
                    y[j-1] = k;
                }
            }
        }

        return y;

    }

}
