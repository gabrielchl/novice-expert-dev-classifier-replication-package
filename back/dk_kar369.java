import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        List<Integer> list=new ArrayList();
         for(int i=0;i<p.length;i++){
                list.add(p[i]);
            }
            int[] res= new int[p.length];
            for(int i=0;i<p.length;i++){

                int index = list.indexOf(i+1);
                    int m=        list.indexOf(index+1);
                    res[i]=m+1;

            }
return res;
    }

}
