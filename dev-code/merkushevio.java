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
        for(int i = 1; i <= p.length; i++ ) {
            int x = findIdxOfNumber(p, i);
            result[i - 1] = findIdxOfNumber(p, x + 1) + 1;
        }
        return result;
    }

    static int findIdxOfNumber(int[] nums, int num) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == num) {
                return i;
            }
        }
        return -1;
    }

}
