import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] r = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            r[i] = findIndexOf(p, findIndexOf(p, i + 1) + 1) + 1;
        }
        return r;
    }

    static int findIndexOf(int[]p, int x) {
        for (int i = 0; i < p.length; i++) {
            if (p[i] == x) {
                return i;
            }
        }
        return -1;
    }

}
