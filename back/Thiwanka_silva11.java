import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
           int[] ar = new int[p.length];
        int r=0;

        for (int i=1;i<=p.length;i++)
        {
            for(int j=1;j<=p.length;j++)

            {
                if(i==p[j-1])
                {
                    for(int k=1;k<=p.length;k++)
                    {
                        if(p[k-1]==j)
                        {
                            ar[r++]=k;
                        }

                    }



                }

            }

        }
        return ar;




    }

}
