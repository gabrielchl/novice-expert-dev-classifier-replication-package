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

        for (int i = 1; i <= p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                if (i == p[j]) {
                    for (int k = 0; k < p.length; k++) {
                        if (j+1 == p[k]) {
                            result[i-1] = k + 1;
                            break;
                        }
                    }
                    break;
                }
            }
        }

        return result;

    }

}
