import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        int[] newArr = Arrays.copyOf(p, p.length);
        int[] newArr2 = new int [p.length];
        Arrays.sort(p);
        for(int i=1; i<=p.length; i++){
            for(int j=0; j<newArr.length; j++){
                if(newArr[j]==i){
                    // System.out.println(newArr[j] + "====" + i + " index = " + j);
                    newArr2[i-1] = j+1;
                }
            }
        }

        for(int i=1; i<=p.length; i++){
            for(int j=0; j<newArr.length; j++){
                if(newArr[j]==newArr2[i-1]){
                    // System.out.println(newArr[j] + "====" + newArr2[i-1] + " index = " + j);
                    p[i-1] = j+1;
                }
            }
        }


        return p;



    }

}
