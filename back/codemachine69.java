import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int ans[]= new int[p.length];
        int z=0;
        for(int x=1;x<=p.length;x++){
           for(int i=0;i<p.length;i++){
               if(p[p[i]-1] == x){
                   ans[z] = i+1;
                   z++;
               }
           }
        }
        return ans;


    }

}
