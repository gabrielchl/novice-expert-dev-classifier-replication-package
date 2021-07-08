import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.List;
public class Solution {
    static int[] permutationEquation(int[] p) {
    List<Integer> al = new ArrayList<Integer>(p.length);
    for (int i : p)
        {
            al.add(i);
        }

        ArrayList<Integer> arl=new ArrayList<Integer>();
         for(int i=1;i<=p.length;i++)
          {
              int index=al.indexOf(i);
              int index1=al.indexOf(index+1);
              arl.add(index1+1);
          }



        int arr[]=new int[p.length];
        for(int i=0;i<p.length;i++)
        {
            arr[i]=arl.get(i);
        }

   return arr;
    }

}
