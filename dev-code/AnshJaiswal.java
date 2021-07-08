import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int index(int p[],int n)
    {
        int x=0;
        for(;x<p.length;x++)
        if(p[x]==n)
        break;
        return x;
    }
    static int[] permutationEquation(int[] p)
    {
        int ans[]=new int[p.length];
        int i_val=0;
        for(int x=1;x<p.length+1;x++)
        {
            int i=index(p,x)+1;
            ans[i_val++]=index(p,i)+1;
        }
        return ans;
    }

}
