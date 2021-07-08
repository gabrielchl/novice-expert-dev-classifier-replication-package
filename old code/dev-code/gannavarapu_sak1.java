import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int n=p.length;
        int [] result=new int[p.length];
        int [] p_inverse=new int[p.length+1];
        /*for(int i=1;i<=p.length;i++){
            result[i-1]=p[p[i-1]-1];
        }*/
        for (int x = 1; x <= n; x++) {
            //int px = scan.nextInt();
            p_inverse[p[x-1]] = x;
        }
        //scan.close();

        /* Calculate and print each y */
        for (int x1 = 1; x1 <= n; x1++) {
            int y = p_inverse[p_inverse[x1]];
            result[x1-1]=y;
        }
        return result;
    }

}
