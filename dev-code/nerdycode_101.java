import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p)
    {
        int arr[]=new int[p.length];
        int x=1,n=p.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(p[j]==x)
                {
                    for(int k=0;k<n;k++)
                    {
                        if(p[k]==j+1)
                        {
                            arr[i]=k+1;
                        }
                    }
                }
            }
            x++;
        }
        return(arr);
    }

}
