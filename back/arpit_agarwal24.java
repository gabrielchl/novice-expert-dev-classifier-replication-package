import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution {

    static int[] permutationEquation(int[] p) {
        String st = "";
        int a[]=new int[p.length];
        int pa[]=new int[p.length];
        for(int i=0;i<p.length;i++)
        {
            pa[p[i]-1]=i;

        }
        for(int i=0;i<p.length;i++)
        {
            a[i]=pa[pa[i]]+1;
        }
        return a;

    }

}
