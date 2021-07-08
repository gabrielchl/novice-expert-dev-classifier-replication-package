import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int range = p.length;
        int[] arr = new int[range];
        int x = 0;
        for(int n=1;n<=range;n++){
            for(int i=0;i<range;i++){
                if(p[i] == n){
                    for(int j=0;j<range;j++){
                        if(p[j] == i+1){
                            arr[x] = j+1;
                            x++;
                        }
                    }
                }
            }
        }

        return arr;

    }

}
