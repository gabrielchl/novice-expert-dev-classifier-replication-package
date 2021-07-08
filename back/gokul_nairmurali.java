import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        int []res=new int[p.length];
        LinkedHashMap<Integer,Integer> data=new LinkedHashMap<Integer,Integer>();
        for(int i=0;i<p.length;i++){
            data.put(p[i],(i+1));
        }
        for(int j=1;j<=p.length;j++){
            int temp=data.get(j);
            res[(j-1)]=data.get(temp);
        }

        return res;


    }

}
