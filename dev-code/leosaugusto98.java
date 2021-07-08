import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        Map<Integer,Integer> indices = new HashMap<Integer,Integer>();
        //Map<Integer,Integer> indicesValues = new HashMap<Integer,Integer>();
        int[] result = new int[p.length];
        for (int i=0; i<p.length; i++){
            indices.put(p[i],i);
            //indicesValues.put(i,p[i]);
        }

        for (int i=0; i<p.length; i++){
            result[i] = indices.get(indices.get(i+1)+1)+1;
        }

        return result;
    }

}
