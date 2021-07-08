import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        // HashMap<Integer,Integer> indexToValueMap = new HashMap<>();
        HashMap<Integer,Integer> valueToIndexMap = new HashMap<>();

        for(int x=0; x<p.length;x++)
        {
            // indexToValueMap.put(x+1,p[x]);
            valueToIndexMap.put(p[x],x+1);
        }

        for(int i=0; i<p.length; i++)
        {
            int index = valueToIndexMap.get(i+1);
            // System.out
            index = valueToIndexMap.get(index);
            p[i] = index;
        }
        return p;
    }

}
