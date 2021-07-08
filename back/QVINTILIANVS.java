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
        int[] result = new int[n];
        for(int i=0; i<n; i++) {
            result[p[p[p[i]-1]-1]-1] = p[i];
        }
        return result;
    }

}
