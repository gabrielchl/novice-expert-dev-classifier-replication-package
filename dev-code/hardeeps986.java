
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] ans = new int[p.length];

        for(int i=1;i<=p.length;i++){
            int x=0;
            for(int j=0;j<p.length;j++){
                if(p[j]==i){
                    x = j+1;
                    int y=0;
                    for(int k=0;k<p.length;k++){
                        if(p[k]==x){
                            y = k+1;
                            ans[i-1] = y;
                        }
                    }
                }
            }
        }

        return ans;

    }

}
