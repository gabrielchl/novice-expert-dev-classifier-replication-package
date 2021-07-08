import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] ans=new int[p.length];
        for(int i=0;i<p.length;i++){
            int loci=0;
            for(int j=0;j<p.length;j++){
                if(p[j]==i+1){
                    loci=j+1;
                    break;
                }
            }
            for(int j=0;j<p.length;j++){
                if(p[j]==loci){
                    ans[i]=j+1;
                }
            }
        }
        return ans;
    }

}
