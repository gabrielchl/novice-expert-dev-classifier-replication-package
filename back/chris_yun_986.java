import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
    //     int[] indexs = new int[p.length];
    //     int[] ret = new int[p.length];
    //     int target = -1;

    //     for (int i = 0; i < p.length; i++) {
    //         indexs[i] = findIndex(p,i+1);
    //     }
    //     for (int i = 0; i < p.length; i++) {
    //         ret[i] = findIndex(indexs,i+1);
    //     }

    // return ret;

        int[] ret = new int[p.length];
        int[] pInverse = new int[p.length+1];
        for (int i = 1; i <= p.length; i++) {
            pInverse[p[i-1]] = i;
        }

        for (int i = 1; i <= p.length; i++) {
            ret[i-1] = pInverse[pInverse[i]];
        }
        return ret;
    }

    // static int findIndex(int[] arr, int target) {
    //     int i = 0;
    //     while (i < arr.length) {
    //         if (target == arr[i])
    //             return i+1;
    //         else i++;
    //     }
    //     return -1;
    // }

}
