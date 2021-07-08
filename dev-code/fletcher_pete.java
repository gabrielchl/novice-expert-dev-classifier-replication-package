import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        int n = p.length;  // numb elements in sequence
        int[] toRet = new int[p.length];

        for (int value = 1; value <= n; value++) {
            int indexOfValue = findIndexOfValue(value, p);
            if (indexOfValue >= 0) {
                int indexOfIndexOfValue = findIndexOfValue(indexOfValue, p);
                toRet[value - 1] = indexOfIndexOfValue;
            }
        }

        return toRet;
    }

    static int findIndexOfValue(int value, int[] p) {
        System.out.println("Looking for index of " + value);
        for (int index = 0; index<p.length; index++) {
            if (p[index] == value) {
                System.out.println("Found index of " + value + " at " + (index+1));
                return index+1;
            }
        }
        return -1;
    }

}
