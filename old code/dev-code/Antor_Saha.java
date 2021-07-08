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

        for (int i = 1; i <= n; i++) {
            int m = 0;
            for (int j = 0; j < n; j++) {
                if (p[j] == i) {
                    m = j+1;
                    break;
                }
            }

            for (int j = 0; j < n; j++) {
                if (p[j] == m) {
                    result[i-1] = j+1;
                    break;
                }
            }
        }

        return result;

    }

}
