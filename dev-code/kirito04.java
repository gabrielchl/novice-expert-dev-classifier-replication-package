import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int r[] = new int[p.length];
        for(int i = 0 ; i < p.length ; i++){
            int idx = -1;
            int x = i+1;

            for(int j = 0 ; j < p.length ; j++){
                if(p[j] == x){
                    idx = j+1;
                }
            }

            for(int k = 0 ; k < p.length ; k++){
                if(p[k] == idx){
                    idx = k+1;
                    break;
                }
            }
            r[i] = idx;
        }
        return r;
    }

}
