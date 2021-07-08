import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] result = new int[p.length];
        for(int i=1; i<=p.length; i++ ){
            int temp = findIndex(p, i)+1;
            result[i-1] = findIndex(p, temp)+1;
        }
        return result;
    }
    static int findIndex(int arr[], int t)
    {
        int len = arr.length;
        return IntStream.range(0, len)
             .filter(i -> t == arr[i])
             .findFirst() // first occurrence
             .orElse(-1); // No element found
    }

}
