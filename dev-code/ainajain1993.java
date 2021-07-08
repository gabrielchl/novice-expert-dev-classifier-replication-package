import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] res = new int[p.length];
        for (int i = 1; i <= p.length; i++) {
            int x = 0;
            for (int j = 0; j < p.length; j++) {
                if (p[j] == i) {
                    x = j + 1;
                    break;
                }
            }
            for (int j = 0; j < p.length; j++) {
                if (p[j] == x) {
                    res[i - 1] = j + 1;
                    break;
                }
            }
        }
        return res;

    }

}
