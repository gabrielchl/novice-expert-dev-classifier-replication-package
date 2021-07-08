import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static int search(int item,int arr[])
    {
        int index=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(item==arr[i])
            {
              index=i;
              break;
            }
        }
        return index;
    }
    static int[] permutationEquation(int[] p) {
        int max=0;
        int res[]=new int[p.length];
        for(int i=0;i<p.length;i++)
        {
            max=Math.max(max,p[i]);
        }
        for(int i=1;i<=max;i++)
        {
            int index=search(i,p)+1;
            int y=search(index,p)+1;
            res[i-1]=y;
        }
        return res;
    }

}
