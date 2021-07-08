import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
          int arr[]=new int[p.length];
          for(int i=0;i<p.length;i++){
             for(int j=0;j<p.length;j++){
                // System.out.println(p[j]);
                 int x=p[j];
                 if(p[x-1]==i+1){
                     arr[i]=j+1;
                 }
             }
          }
 return arr;
    }

}
