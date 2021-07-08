import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int []res = new int[p.length];
        for(int x=1;x<=p.length;x++){
            int index= 0;
            for(int i=0;i<p.length;i++){
                if(p[i]==x){
                    index = i+1;
                    break;
                }
            }
            int y = 0;
            for(int i=0;i<p.length;i++){
                if(p[i]==index){
                    y = (i+1);
                    break;
                }
            }
            res[x-1] = y;
        }
        return res;

    }

}
