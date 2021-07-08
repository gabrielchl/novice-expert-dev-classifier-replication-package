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
        for (int i = 0; i < p.length; ++i) {
            int tmp = 0;
            for (int j = 0; j < p.length; ++j) {
                if (p[j] == i + 1) {
                    tmp = j + 1;
                    break;
                }
            }
            int tmp1 = 0;
            for (int j = 0; j < p.length; ++j) {
                if (p[j] == tmp) {
                    tmp1 = j + 1;
                }
            }
            res[i] = tmp1;
        }
        return res;
    }

}
