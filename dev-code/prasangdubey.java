import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int n=p.length;
        int[] result=new int[n];
        int[] index=new int[n];
        for(int i=0;i<n;i++){
            int value=p[i];
            index[value-1]=i+1;
        }
        for(int i=0;i<n;i++){
            result[i]=index[index[i]-1];
        }
        return result;
    }

}
