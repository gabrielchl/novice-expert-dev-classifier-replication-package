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
         int[] arr=new int[p.length];
         for(int i=1;i<p.length+1;i++)
         {

             arr[i-1] =getIndex(p, getIndex(p,i)+1)+1;
         }
         return arr;

    }
    static int getIndex(int[] arr,int val)
     {
         for(int i=0;i<arr.length;i++)
         {
             if(val==arr[i])
             {
                 return i;

             }

         }
         return -1;
     }
}
