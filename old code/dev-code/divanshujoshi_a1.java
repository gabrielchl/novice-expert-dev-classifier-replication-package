import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] arr) {
    int n = arr.length;
    int[] res = new int[n];
    Map<Integer,Integer> hm = new TreeMap<Integer,Integer>();
    for(int i=0;i<n;i++)
        hm.put(arr[i],i+1);
    Map<Integer,Integer> hm1 = new TreeMap<Integer,Integer>();
    for(Map.Entry<Integer,Integer> e : hm.entrySet())
    {
        hm1.put(e.getKey(),hm.get(e.getValue()));
    }
    int i = 0;
    for(Map.Entry<Integer,Integer> e : hm1.entrySet())
    {
        res[i++] = e.getValue();
    }
    return res;
    }

}
