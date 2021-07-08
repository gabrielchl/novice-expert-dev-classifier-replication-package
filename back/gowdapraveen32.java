import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] a) {
        int n = a.length;
        int p[] = new int[n];
        int temp=0;
        for (int x=1; x<=n; x++){
            for(int j=0; j<n; j++){
                if(a[j]==x){
                    for(int i=0; i<n; i++ ){
                        int t = a[i] -1;
                        if(a[t] == x)
                            temp=i+1;
                    }
               }
            }
            p[x-1]=temp;
        }

return p;
    }

}
