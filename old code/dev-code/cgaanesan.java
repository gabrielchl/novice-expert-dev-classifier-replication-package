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
        int[] fi=new int[n];
        int[] ans=new int[n];
        int pt=0;
        for(int j=1;j<=n;j++)
        {
        for(int i=0;i<n;i++)
        {
            if(j==p[i])
            {
                fi[pt++]=i+1;
                //t++;
            }
        }
        }
          for(int i=0;i<n;i++)
        {
           System.out.println(fi[i]);
        }

        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               if(fi[i]==p[j])
                 ans[c++]=j+1;
            }

        }
         for(int i=0;i<n;i++)
        {
           System.out.println(ans[i]);
        }

        return ans;

    }

}
