import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int x,r=0,j,m=0;
        int a[]=new int[p.length];
        for(x=1;x<=p.length;x++)
        {
            for(j=0;j<p.length;j++)
            {
                if(p[j]==x)
                {
                    r=j;
                    break;
                }
            }
            r++;
            for(j=0;j<p.length;j++)
            {
                if(p[j]==r)
                {
                    m=j;
                    break;
                }
            }
            m++;
            for(j=0;j<p.length;j++)
            {
                a[x-1]=m;
            }
        }
        return(a);
    }

}
