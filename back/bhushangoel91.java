import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int n = p.length;
        System.out.println("p : " + Arrays.toString(p));

        int[] arr = new int[n+1];
        int[] arr2 = new int[n];

        for(int i=0; i<n; i++) {
            arr[p[i]] = i+1;
        }

        System.out.println("arr: " + Arrays.toString(arr));

        int j = 0;

        for(int i=1; i<=n; i++) {
            int v = arr[i];
            arr2[j] = arr[v];
            j++;
        }

        return arr2;

    }

}
