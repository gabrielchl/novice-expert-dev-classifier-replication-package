import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] b = new int[p.length+1];
        for(int i=0;i<p.length;i++)
            b[p[i]] = i+1;

        int[] out = new int[p.length];
        for(int i=0;i<p.length;i++)
        {
            out[p[i]-1] = b[i+1];
        }
        return out;

    }

}
