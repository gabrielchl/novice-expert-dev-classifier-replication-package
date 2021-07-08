import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

     static int[] permutationEquation(int[] p) {
        int[] ans=new int[p.length];
        for(int value=1;value<=p.length;value++){
            int x=indexOf(p,value);
            ans[value-1]=indexOf(p,x);
        }
        return ans;
    }

    private static int indexOf(int[] p,int key){
        for(int i=0;i<p.length;i++){ if(key==p[i])return (i+1);}
        return -1;
    }
}
