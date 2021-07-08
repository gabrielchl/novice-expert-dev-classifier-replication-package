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
     int ans[]=new int[n];
     for(int i=0;i<n;i++)
       {
           int ele=p[i];
           for(int j=0;j<n;j++)
             {
                 if(p[j]==i+1)
                   {
                       ans[ele-1]=j+1;
                       break;
                   }
             }
       }
       return ans;

    }

}
