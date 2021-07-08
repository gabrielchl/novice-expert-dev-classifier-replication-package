import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int count = 1;
        int min =p[0];
        int max = p[0];

        for(int i : p)
        {
            hm.put(i,count);
            count++;
            if(i<min)
                min = i;
            if(i>max)
                max=i;
        }
        int[] res = new int[max];
        for(int i=min; i<=max; i++)
        {
            res[i-1] = hm.get(hm.get(i));
        }

    return res;
    }

}
