import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        int[] p1 = new int[p.length];
        int[] pp = new int[p.length];

        for (int i = 0; i < p.length; i++) {
            p1[p[i] - 1] = i;
        }

        for (int i = 0; i < p.length; i++) {
            pp[i] = p1[p1[i]] + 1;
        }

        return pp;
    }

}
