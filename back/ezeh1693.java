import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int n = p.length-1;
        int[] r = new int[n];
        for (int x = 1; x <= n; x++) {
            int y = p[p[x]];
            r[x-1] = y;
        }

        return r;
    }

}
