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
        for(int i=1; i <= p.length; i++){
            int firstIndex = findValue(p, i);
            int secondIndex = findValue(p, firstIndex);
            arr[i-1] = secondIndex;
        }
        return arr;
    }

    static int findValue(int[] arr, int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x)
                return i+1;
        }
        return -1;
    }

}
