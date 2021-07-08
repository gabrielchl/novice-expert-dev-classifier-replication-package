import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] result=new int[p.length];
        for(int i=0; i<p.length; i++){
            int index=-1;
            for(int j=0; j<p.length; j++){
                if(p[j]==(i+1)){
                    index=j+1;
                    break;
                }
            }
            for(int k=0; k<p.length; k++){
                if(p[k]==index){
                    index=k+1;
                    break;
                }
            }
            result[i]=index;
        }
        return result;
    }

}
