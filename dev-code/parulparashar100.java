import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int sol[] = new int[p.length];
        int x = 0;
        for(int i = 1; i <= p.length; i++) {
            for(int j = 0; j < p.length; j++) {
                if(i == p[j]){
                    x = j + 1;
                    break;
                }
            }
            for(int k = 0; k < p.length; k++){
                if(x == p[k]){
                    x = k + 1;
                    break;
                }
            }
            sol[i - 1] = x;
        }
        return sol;
    }

}
