import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int res[]=new int[p.length];
        int index=0;
        for(int i=0;i<p.length;i++)
        {
            //index=p[i];
            //res[i]=p[p[p[p[i]-1]-1]-1];
             res[p[p[i]-1]-1]= i+1;
        }
        return res;
    }

}
