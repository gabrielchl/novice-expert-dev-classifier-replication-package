import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        int [] pp = new int [p.length+1];

        for (int i=0; i<p.length; i++) {
            int k = p[i];
            pp[k] = i+1;
        }

        int [] ppp = new int [p.length];

        for (int i=1; i<=p.length; i++) {
           ppp[i-1] = pp[pp[i]];
        }

        return ppp;

    }

}
