import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
       int[] result = new int[p.length];
       HashMap<Integer,Integer> hInside = new HashMap<Integer,Integer>();
       HashMap<Integer,Integer> hOutside = new HashMap<Integer,Integer>();
       int counter = 1;
       for(int i=0;i<p.length;i++){
          hOutside.put(p[i],i+1);
       }
       for(int i=0;i<result.length;i++){
          int temp = hOutside.get(counter);
          result[i] = hOutside.get(temp);
          counter++;
       }
       return result;


    }

}
