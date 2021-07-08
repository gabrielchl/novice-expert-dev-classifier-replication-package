import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int a[]=new int[p.length];
        int i,num,j,index,index1=0;
        for(i=0;i<p.length;i++)
        {
            num=p[i];
            index=i+1;
            for(j=0;j<p.length;j++)
            {
                if(p[j]==index)
                {
                index1=j++;
                break;
                }
            }
            a[num-1]=index1+1;


        }
        return a;


    }

}
