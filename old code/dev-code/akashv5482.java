import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] ans = new int[p.length];
         for(int i=0;i<p.length;i++){
              int a=search(p,i+1);
             int b=search(p,a);
             ans[i]=b;
        }
       return ans;
    }
    public static int search(int[] a,int n){
        int ans=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==n){
             ans=i+1;
                break;
            }
        }
        return ans;
    }
}
