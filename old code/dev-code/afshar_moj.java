import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int findIndex(int[] array, int idx) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]==idx)
                return (i+1);
        }
        return 0;
    }

    static int[] permutationEquation(int[] p) {
         int[] result = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            int val = findIndex(p, i + 1);
            result[i] = findIndex(p, val);
        }
        return result;

    }

}
