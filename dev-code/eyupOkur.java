import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static int findIndex (int number,int[] arr){
        for(int i = 0; i < arr.length; i++ ){
            if(arr[i] == number) return i;
        }
        return arr.length;
    }
    static int[] permutationEquation(int[] p) {


        int[] result = new int[p.length];
        for(int i = 1; i <= p.length; i++){

           int index = findIndex(i,p) +1 ;
            index = findIndex(index,p);
           //System.out.println(index+1);
            result[i-1] = index+1;
        }
        return result;
    }

}
