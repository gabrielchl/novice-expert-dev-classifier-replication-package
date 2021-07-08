import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        int[] arr = new int[p.length];

        for (int i = 0; i < p.length; i++) {

            arr[i] = indexOf(p, (indexOf(p, i + 1) +1)) + 1;

        }
        return arr;

    }
    static int indexOf(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) return i ;
        }
        return -1;
    }

}
