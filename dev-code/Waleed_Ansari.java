import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] n) {

    int[] x = new int[n.length];

    for(int i=1; i<n.length+1; i++){

      for(int j=1; j<n.length+1; j++){

        if(i == n[j-1]){

          for(int k=1; k<=n.length; k++){

            if(j == n[k-1]){
              x[i-1] = k;
              break;
            }

          }
          break;

        }

      }

    }

    return x;

    }

}
