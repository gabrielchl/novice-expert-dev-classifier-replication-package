import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p)
    {
        int l = p.length;
        int[] m = new int[l];
        int[] r = new int[l];

        for(int i=0;i<l;i++)
        {
            m[p[i]-1] = i+1;
        }
        for(int i=0;i<l;i++)
        {
            r[i] = m[m[i]-1];
        }
        return r;
    }

}
