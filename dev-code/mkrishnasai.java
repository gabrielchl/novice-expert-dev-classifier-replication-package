import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int arr[] = new int[p.length];
        int ref[] = new int[p.length];

        for(int i = 0;i<p.length;++i){
            ref[i] = p[i];
        }

        Arrays.sort(ref);//1 2 3 4 5
        int j = 0;
        for(int i = 0;i<p.length;i++){
            j = 0;
            while(true){
                if(ref[i] == p[p[j]-1]){//5 2 1 3 4
                    arr[i] = ref[j];
                    break;
                }
                j++;
            }
        }
    return arr;
    }

}
