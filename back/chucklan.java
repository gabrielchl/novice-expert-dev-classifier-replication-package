import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] ridx = new int[p.length + 1];
        int[] res = new int[p.length];
        for (int i = 1; i <= p.length; i++) {
            ridx[p[i - 1]] = i;
        }
        for (int i = 1; i <= res.length; i++) {
            res[i - 1] = ridx[ridx[ridx[p[i - 1]]]];
        }
        return res;
    }

}
