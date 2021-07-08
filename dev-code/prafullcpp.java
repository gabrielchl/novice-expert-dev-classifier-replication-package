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
        for(int i = 1; i <= p.length; i++){
            ans[i-1] = indexOf(indexOf(i, p), p);
        }
        return ans;
    }

    static int indexOf(int k, int[] p){
        for(int i = 0; i<p.length; i++){
            if(p[i] == k)
                return i+1;
        }
        return 0;
    }

}
