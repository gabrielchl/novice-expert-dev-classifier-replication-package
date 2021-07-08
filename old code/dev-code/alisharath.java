import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        //number,index
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,0);
        for(int i=0;i<p.length;i++){
            map.put(p[i],i+1);
        }
        int []ans= new int[p.length];
        for(int i=1,k=0;i<=p.length;i++,k++){
            ans[k]=map.get(map.get(i));
        }
        return ans;
    }

}
