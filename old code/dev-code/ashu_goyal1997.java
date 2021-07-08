import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Arrays.*;
import java.util.concurrent.*;
import java.util.regex.*;
import org.apache.commons.lang3.ArrayUtils;

public class Solution {

    // Arrays.asList(theArray).indexOf(o)
    static int[] permutationEquation(int[] p) {
        int[] array= new int[p.length];
        // int ind1=0,ind2=0;
        // for(int i=1; i<=p.length;i++){
        //     for(int j:p){
        //         if(j==i){
        //             ind1=Arrays.asList(p).indexOf(j)+1;
        //             System.out.println(ind1);
        //             for(int k:p){
        //                 if(k==ind1){
        //                     ind2=Arrays.asList(p).indexOf(k)+1;
        //                     System.out.println(ind2);
        //                 }
        //             }
        //         }
        //     }
        //     array[i-1]=ind2;
        // }
        for(int i=1; i<=p.length;i++){
            //array[i-1]=Arrays.asList(p).indexOf(Arrays.asList(p).indexOf(i));
            array[i-1]=ArrayUtils.indexOf(p, ArrayUtils.indexOf(p,i)+1)+1;
        }


        return array;
    }

}
