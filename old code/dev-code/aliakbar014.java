import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] p1 = new int[p.length];
        for(int i = 0; i < p.length; i++){
          p1[p[p[i]-1]-1] = i+1;
        }//saves the address of p (4,6,2,1,3,5) => p1 (4,3,5,1,6,2)
        //saves the address of p(p) => p2 (5,)
        int[] p2 = new int[p.length];
        for(int i = 0; i < p.length; i++){
          p2[p[p1[i]-1]-1] = i+1;
        }
        return p1;

    }

}
