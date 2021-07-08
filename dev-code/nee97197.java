import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] arr=new int[p.length];
        int idx=0;
        for(int i=0;i<p.length;i++){
            for(int j=0;j<p.length;j++){
            if(p[j]==i+1){
                idx=j+1;
            }

            }
            for(int k=0;k<p.length;k++){
                if(p[k]==idx){
                    arr[i]=k+1;
                }
            }
      }
      return(arr);

    }

}
