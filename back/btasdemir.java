import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static int[] map = new int[51];

    static int[] permutationEquation(int[] p) {

        int[] indexes = new int[p.length];
        int[] yVals = new int[p.length];

        for(int i = 0; i < p.length; i++) {
            indexes[p[i] - 1] = i;
        }

        for(int i = 0; i < p.length; i++) {
            yVals[i] = indexes[indexes[i]] + 1;
        }

        return yVals;

    }

}
