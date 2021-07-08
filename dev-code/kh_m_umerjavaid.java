import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

          int []result =new int [p.length];

          int []index1  =new int [p.length+1];

          for(int i=0; i < p.length ; i++){
               index1[p[i]] = i+1;
          }

           for(int i=1; i < index1.length ; i++){

              result[i-1]=index1[index1[i]];
          }


        return result;
    }

}
