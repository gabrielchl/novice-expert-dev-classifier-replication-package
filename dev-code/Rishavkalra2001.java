import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
                 int n=p.length;
                 int m=1;
                 int[] ans=new int[n];
                 int y=0;
                while(m<=n){
                     for(int i=0;i<p.length;i++){
                         if(m==p[i]){
                             for(int j=0;j<p.length;j++){
                                 if((i+1)==p[j]){
                                     ans[y]=j+1;
                                     if(y<n-1)
                                     y++;
                                 }
                             }
                         }
                     }
                    m++;
                }
                return ans;
    }

}
