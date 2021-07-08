import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int getPos(int[] n, int key){
        for(int i=0;i<n.length;i++){
            if(n[i]==key){
                return i;
            }
        }
        return -1;
    }
    static int[] permutationEquation(int[] p) {

            HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
            int n=p.length;
            int d=0;
            int result[]=new int[n];
        for(int i=1;i<=n;i++){
               mp.put(p[d],i);
               d++;
        }
        d=0;
         for(int i=1;i<=n;i++){
            result[d]=mp.get(mp.get(i));
            d++;
         }
         return result;

    }

}
