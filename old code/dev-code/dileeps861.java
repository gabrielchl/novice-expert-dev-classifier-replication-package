import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
            Map <Integer, Integer> pps= new HashMap<>();
            for(int i=0; i<p.length;i++){
                pps.put(p[i],i+1);
            }
            int[] result= new int[p.length];
            for(int i=0; i<p.length;i++){
                int val=pps.get(i+1);
                result[i]=pps.get(val);
            }
            return result;

    }

}
