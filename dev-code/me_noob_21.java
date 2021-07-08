import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
     static int p(int x, int[] a) {
               return a[x-1];
           }


    static int[] permutationEquation(int[] a) {
        int [] ar = new int[a.length];
        for (int i= 1; i<=a.length;i++)
        {
            for (int j =1;j<=a.length;j++) {
                if (p(p(j,a),a)==i) ar[i-1]=j;
            }
        }

return ar;
    }

}
