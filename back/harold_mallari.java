import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] xVal = new int[p.length];
        //String pStr = Arrays.toString(p).replaceAll("\\[|\\]| |,","");
        //System.out.println(" pStr = " + pStr);
        for (Integer x=1; x<=p.length; x++) {
            int idx=0;
            int val=0;
            for (int y=0; y<p.length; y++) {
                if (p[y]==x) {
                    idx = y+1;
                    break;
                }
            }
            for (int i=0; i <p.length; i++) {
                if (p[i]==idx) {
                    xVal[x-1] = i+1;
                    break;
                }
            }
            /*
            Integer i = pStr.indexOf(x.toString()) + 1;
            System.out.println(String.format("x = %s, i = %s", x, i));
            xVal[x-1] = pStr.indexOf(i.toString()) + 1;
            */
        }
        return xVal;

    }

}
