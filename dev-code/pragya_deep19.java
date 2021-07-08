import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int arr [] = new int [p.length];
        HashMap<Integer,Integer> pMap  = new HashMap();
        for(int i=0;i<p.length;i++)
        {
            pMap.put(p[i],i+1);
        }
        for(int i=1;i<=p.length;i++)
        {
            int val = pMap.get(pMap.get(i));
            arr[i-1] = val;
        }
        return arr;
    }

}
