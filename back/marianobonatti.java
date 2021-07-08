import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] result = new int[p.length];
        for (int i=0; i< p.length;i++) {
            int position = findPosition(i+1, p);
            result[i] = findPosition(position, p);
        }
        return result;
    }

    private static int findPosition(int value, int[] arr) {
        int position = 1;
        for (int i=0; i< arr.length; i++) {
            if (arr[i] == value){
                position = i+1;
                break;
            }
        }
        return position;
    }


}
