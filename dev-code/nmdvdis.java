import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] res=new int[p.length];
        int x=1;
        for(int j=0;j<p.length;j++){
            boolean found=false;
            if(x==p[j]){
                for(int k=0;k<p.length;k++){
                    if(j+1==p[k]){
                        res[x-1]=k+1;
                        found=true;break;
                    }
                }
            }
            if(found){
                x++; j=-1;
            }
        }
        return res;
    }

}
