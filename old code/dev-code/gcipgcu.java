import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static int findIndex(int arr[], int t)
    {

        // if array is Null
        if (arr == null) {
            return -1;
        }

        // find length of array
        int len = arr.length;
        int i = 0;

        // traverse in the array
        while (i < len) {

            // if the i-th element is t
            // then return the index
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }

    static int[] permutationEquation(int[] p) {
        int[] res = new int[p.length];
        int[] indexof = new int[p.length];
        for( int x = 0; x < p.length; x++ ) {
            indexof[x] = findIndex(p, x+1 );
            res[x] = ( findIndex(p, indexof[x] + 1) + 1 );
        }
        return res;
    }

}
