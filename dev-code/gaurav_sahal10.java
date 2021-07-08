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
        int arr[]=new int[n];
        for(int x=1;x<=n;x++)
        {
            int t=0;
            for(int i=0;i<n;i++)
            {
                if(p[i]==x)
                {
                    t=i+1;
                    break;
                }
            }
            for(int i=0;i<n;i++)
            {
                if(p[i]==t)
                {
                    arr[x-1]=i+1;
                    break;
                }
            }
        }
        return arr;
    }

}
