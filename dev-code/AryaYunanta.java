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
        int index = 0;

        for(int i = 1; i <= p.length; i++) {
            for(int j = 1; j <= p.length; j++) {
                if(i == p[j-1]) {
                    index = j;

                    for(int k = 1; k <= p.length; k++) {
                        if(index == p[k-1]) {
                            index = k;
                            break;
                        }
                    }

                    break;
                }
            }
            result[i-1] = index;
        }
        return result;
    }

}
