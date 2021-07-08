import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] po = new int[p.length];
        Map<Integer,Integer> sequenceFunction = new HashMap<>();
        for(int i = 1; i <= p.length; i++)
        {
            sequenceFunction.put(p[i-1], i);
        }

        for(int i = 1; i <= p.length; i++){
            int x = i;
            int t = sequenceFunction.get(x);
            int y = sequenceFunction.get(t);
            po[i-1] = y;
            // System.out.println(y);
        }
        return po;
    }

}
