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
        int []res = new int[n];
        for(int i = 0; i<n; i++){
            res[p[p[i]-1]-1] = i+1;
        }
        return res;


    }

}
