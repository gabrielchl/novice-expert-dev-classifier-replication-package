import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int n = p.length;
        int x,y,z,j,k;
        int[] result = new int[n];
        for(x=1;x<=n;x++){
            z=x;
            for(j=0;j<n;j++){
                if(p[j]==z){
                    z=j+1;
                    break;
                }
            }
            for(y=0;y<n;y++){
                if(p[y]==z){
                    result[x-1] = y+1;
                    break;
                }
            }
        }
        return result;
    }

}
