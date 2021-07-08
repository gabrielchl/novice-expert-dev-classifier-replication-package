import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int l=p.length;
        int s=1;
        int y[]=new int[l];
        for(int i=0;i<l;i++)
        {
            for(int k=0;k<l;k++)
            {
             if(i+1==p[k])
               {
                for(int j=0;j<l;j++)
                    {  if(k+1==p[j])

                        y[i]=j+1;

                    }
                }
            }


        }
        return y;


    }

}
