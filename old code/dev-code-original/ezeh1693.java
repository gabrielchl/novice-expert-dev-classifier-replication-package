import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        // Complete this function
        int n = p.length-1;
        int[] r = new int[n];
        for (int x = 1; x <= n; x++) {
            int y = p[p[x]];
            r[x-1] = y;
        }
        
        return r;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] p = new int[n+1];
        for(int p_i = 1; p_i <= n; p_i++){
            int x = in.nextInt();
            p[x] = p_i;
        }
        int[] result = permutationEquation(p);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
