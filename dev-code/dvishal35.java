import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int b []=new int[p.length];
        for(int i=0;i<p.length;i++){
            b[i]=findpos(p,findpos(p,i+1));
        }
    return b;
    }
    static int findpos(int [] a, int k){
        for(int i=0;i<a.length;i++){
            if(a[i]==k)
                return i+1;
        }
        return -1;
    }

}
