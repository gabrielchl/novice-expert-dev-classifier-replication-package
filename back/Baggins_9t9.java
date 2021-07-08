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
     /*   int k[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i+1)==p[p[j+1]])
                {
                     k[i]=j+1;
                     break;
                }

            }
        }
        return k;*/
         int[] resultArr = new int[p.length];
    for(int i=0; i<p.length; i++) {
        resultArr[p[p[p[i]-1]-1]-1] = p[i];
    }

    return resultArr;

    }

}
