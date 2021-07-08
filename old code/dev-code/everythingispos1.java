import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int n = p.length;
        int[] result = new int[n];
        int j = 0;
        for(int x=1; x<=n; x++) {
            int i;
            for(i=0; i<n; i++) {
                if(p[i] == x) {
                    break;
                }
            }

            int prev = i+1;
            for(i=0; i<n; i++) {
                if(p[i] == prev) {
                    break;
                }
            }

            result[j] = i+1;
            j++;
        }

        return result;
    }

}
