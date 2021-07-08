import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int res[] = new int[p.length];
        for(int i = 0 ; i < p.length ; i++){
            for(int j = 0 ; j < p.length ; j++){
                if(i + 1 == p[p[j] - 1]){
                    res[i] = j + 1;
                }
            }
        }
        return res;
    }

}
