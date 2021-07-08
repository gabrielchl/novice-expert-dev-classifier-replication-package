import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        HashMap<Integer,Integer> h= new HashMap<>();
        int j=0;
        for(int i=1;i<=p.length;i++)
        {
            h.put(p[j],i);
            j++;
        }
        j=0;
        for(int i=1;i<=p.length;i++)
        {
            p[j]=h.get(h.get(i));
            j++;
        }
        return p;
    }


}
