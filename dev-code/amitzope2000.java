import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int [] tmp = new int[p.length+1];
        for(int j=1;j<tmp.length;j++){
            tmp[j] = p[j-1];
        }
        Arrays.sort(tmp);
        int o_p,o_p_1,fvar =0;
        int [] final_array = new int[p.length];
        for(int i=1;i<=tmp[p.length];i++){
            o_p = 0;
            for(int k=0;k<p.length;k++){
                if(p[k] == tmp[i]){
                    o_p = k+1;
                }
            }
            o_p_1 = 0;
            for(int m =0;m<p.length;m++){
                if(o_p == p[m]){
                    o_p_1 =  m+1;
                }
            }
            final_array[fvar++] = o_p_1;
        }

        return final_array;

    }

}
