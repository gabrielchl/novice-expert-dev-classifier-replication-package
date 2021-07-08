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
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=1;i<=n;i++){
            hm.put(p[i-1],i);
        }
        for(int i=1;i<=n;i++){
            arr[i-1]=hm.get(hm.get(i));
        }
        return arr;

    }

}
