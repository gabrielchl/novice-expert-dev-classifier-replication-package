import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        // we're doing the inverse of p[p[i]]

        // for given index i to n
        // find index where p[index] = i
        // then find idx where p[idx] = index
        // add
        int[] returnArray = new int[p.length];
        int[] valueArray = new int[p.length + 1];
        for (int i = 0; i < p.length; i++) {
            int val = p[i];
            valueArray[val] = i + 1;
        }

        for (int i = 1; i <= p.length; i++) {
            int index = valueArray[i];
            returnArray[i-1] = valueArray[index];
        }

        return returnArray;
    }

}
