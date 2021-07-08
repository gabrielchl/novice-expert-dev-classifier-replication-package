import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        Map<Integer,Integer> positions = new HashMap<>();
        int[] result = new int[p.length];
        for(int i=0;i<p.length;i++){
            positions.put(p[i],i+1);
        }

        for(int i=0;i<p.length;i++){
            int num  = i+1;
            int pos = positions.get(num);
            result[i] = positions.get(pos);
        }
        return result;
    }

}
