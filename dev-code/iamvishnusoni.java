import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int output[] = new int[p.length];

        for(int i =0;i<p.length;i++){
            for(int j = 0;j<p.length;j++){
                if(i+1 == p[j]){
                    for(int k = 0;k<p.length;k++){
                        if(j+1==p[k]){
                            output[i]=k+1;
                            break;
                        }
                    }
                    break;
                }
            }
        }

        return output;
    }

}
