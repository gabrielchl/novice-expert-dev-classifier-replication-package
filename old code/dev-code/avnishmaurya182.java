import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int res[]=new int[p.length];
        int m=0;
        for(int i=1;i<=p.length;i++)
        {
            for(int j=0;j<p.length;j++)
            {
                if(i==p[j])
                {
                    for(int k=0;k<p.length;k++)
                    {
                        if(j+1==p[k])
                        {
                            res[m]=k+1;
                            m++;
                        }
                    }
                }
            }
        }
        return res;


    }

}
