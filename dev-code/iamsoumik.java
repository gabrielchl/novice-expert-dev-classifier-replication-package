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
        int r[] = new int[n];
        int flag = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i+1 == p[j]){
                    for(int k = 0; k<n; k++){
                        if(j+1 == p[k]){
                            flag = k + 1;
                        }
                    }
                }
            }
            r[i] = flag;
        }
        return r;
    }

}
