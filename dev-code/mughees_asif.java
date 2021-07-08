import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static int[] permutationEquation(int[] p) {
        int length = p.length;
        int count = 0;
        int[] result = new int[length];
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < length; j++) {
                if (p[j] == i) {
                    count = j + 1;
                    break;
                }
            }
            for (int j = 0; j < length; j++) {
                if (p[j] == count) {
                    count = j + 1;
                    break;
                }
            }
            result[i - 1] = count;
        }
        return result;
    }

}
