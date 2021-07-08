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
        int [] p_inverse = new int[n + 1];
        int []res=new int[n];
        for (int x = 1; x <= n; x++) {
            p_inverse[p[x-1]] = x;
        }
        for (int x = 1; x <= n; x++) {
            int y = p_inverse[p_inverse[x]];
            res[x-1]=y;
        }
        return res;

    }

}
