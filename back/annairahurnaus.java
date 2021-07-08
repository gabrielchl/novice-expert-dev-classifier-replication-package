import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
         int[] result = new int[p.length];

        int[] indexArr = new int[p.length];

        for (int i = 0; i < p.length; i++) {
            int val = p[i];
            indexArr[val - 1] = i + 1;

        }
        for (int i = 0; i < p.length; i++) {
            result[i] = indexArr[indexArr[i] - 1];
        }
        return result;
    }

}
