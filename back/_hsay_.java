import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        int ans[] = new int[p.length];
        for(int i=0;i<p.length;i++){
            int a = findPos(i+1,p);
            int res = findPos(a,p);
            ans[i] = res;
        }
    return ans;
    }

    static int findPos(int i,int arr[]){
        int pos=0;
        for(int j:arr){
            pos++;
            if(j == i){
                return pos;
            }
        }
        return 0;
    }
}
