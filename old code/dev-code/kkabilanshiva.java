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

        for (int i=1;i<=p.length;i++){
            result[i-1] = getLocation(p,getLocation(p,i));
        }

        return result;

    }

    static int getLocation(int[] p , int x) {

        for (int i=0;i<p.length;i++) {
            if (p[i]==x) {
                return i+1;
            }
        }
        return x;

    }

}
