import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
       int n =  p.length; int [] res = new int [n] ;
       List <Integer> lst = new ArrayList<>() ;
       int ind =0;
       for(int x = 0 ; x < p.length  ; x++)
       {
           lst.add(p[x]);
       }

          for(int x = 1 ; x <= p.length  ; x++)
       {
             res[x-1]=(lst.indexOf(lst.indexOf(x)+1)+1 );

       }



     return res ;
    }

}
