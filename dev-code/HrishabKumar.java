import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int x[] = new int[p.length+1];

        for (int i = 1; i < x.length; i++) {
            for (int j = 0; j < p.length; j++) {
                if (i == p[j]) {
                    x[i] = j + 1;
                }
            }
        }
        for (int i = 1; i < x.length; i++) {
            p[i - 1] = x[x[i]];
        }
        return p;

    }

}
