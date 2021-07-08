import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] array=new int[p.length];
        int a=1;
        for(int i=0;i<p.length;i++){
            for(int j=0;j<p.length;j++){
                if(p[j]==i+1){
                    for(int k=0;k<p.length;k++){
                        if(p[k]==j+1){
                            array[i]=k+1;
                            a++;
                        }
                    }
                }
            }
        }
        return array;

    }

}
