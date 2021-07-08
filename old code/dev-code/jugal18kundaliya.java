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
        int[] rel = new int[p.length];
        for(int i=0; i<p.length; i++)
            p[i]--;
        for(int i=0; i<p.length; i++) {
           // int temp=p[i];
            for(int j=0; j<p.length; j++) {
                if(i==p[j]){
                    for(int k=0; k<p.length; k++) {
                        if(j==p[k]) {
                            ans[i]=k+1;
                        }
                    }
                }


            }
        }
        return ans;
    }

}
