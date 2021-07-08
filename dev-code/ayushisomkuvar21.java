import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
       ArrayList<Integer> a = new ArrayList<>();
       for(int i = 0;i<p.length;i++)
       a.add(p[i]);
       for(int i = 1;i<=a.size();i++)
       {
           int b = a.indexOf(i)+1;
           p[i-1]=a.indexOf(b)+1;
           System.out.println(b+" "+a.indexOf(b));
       }
       return p;
    }

}
