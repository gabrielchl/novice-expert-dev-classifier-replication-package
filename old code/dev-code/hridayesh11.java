import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int size = p.length, index = 0;
        int pInverse[] = new int[size];
        int result[] = new int[size];
        for(int i = 0; i < size; i++) {
            pInverse[p[i]-1] = i;
        }
        for(int a : pInverse) {
            result[index++] = pInverse[a]+1;
        }
        return result;
    }

}
