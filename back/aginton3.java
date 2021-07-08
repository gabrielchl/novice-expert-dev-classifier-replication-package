import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

   static int[] permutationEquation(int[] p) {
        int[] res = new int[p.length];
        HashMap<Integer,Integer> mapNumToIndex = createMapNumToIndex(p);
        for (int i=1; i<=p.length; i++){
            int poi = mapNumToIndex.get(i) + 1;
            int popoi = mapNumToIndex.get(poi) + 1;
            res[i-1] = popoi;
        }
        return res;
    }

    private static HashMap<Integer, Integer> createMapNumToIndex(int[] p) {
        HashMap<Integer,Integer> res = new HashMap<>();
        for (int i=0; i<p.length; i++){
            res.put(p[i],i);
        }
        return res;
    }


}
