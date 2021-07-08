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
        int[] arrinv = new int[n+1];
        int[] ans = new int[n];
        for(int i=1;i<=n;i++)
        {
            arrinv[p[i-1]] = i;
        }
        for(int i=1; i<=n;i++){
            ans[i-1] = arrinv[arrinv[i]];
        }
        return ans;

    }

}
