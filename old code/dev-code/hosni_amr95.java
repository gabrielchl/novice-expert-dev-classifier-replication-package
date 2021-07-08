import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int n =p.length;
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for(int i=1;i<=n;i++)   mp.put(p[i-1],i);
         for(int i=1;i<=n;i++) p[i-1]=(mp.get(mp.get(i)));

return p;
    }

}
