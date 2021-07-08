import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] res = new int[p.length];
        for(int i=1;i<=p.length;i++){
            int index=0;
            for(int j=0;j<p.length;j++)
                if(p[j]==i){
                    index=j+1;
                    break;
                    //System.out.println(i+"  "+index+"  "+p[j]);
                }
            //System.out.println(index);
            for(int j=0;j<p.length;j++)
                if(p[j]==index){
                    index=j+1;
                    break;
                    //System.out.println(i+"  "+index+"  "+p[j]);
                }
            res[i-1]=index;
        }
        return res;
    }

}
