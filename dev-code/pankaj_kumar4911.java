import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int t[] = new int[p.length];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i : p)
        {
            list.add(i);
        }
        ArrayList<Integer> nlist = new ArrayList<Integer>();
        for(int i = 1; i <= p.length; i++)
        {
            nlist.add(list.indexOf(list.indexOf(i)+1)+1);
        }

        return nlist.stream().mapToInt(i->i).toArray();
        //nlist.toArray(new Integer[nlist.size()]);
        //nlist.stream().mapToInt(i -&gt;i).toArray();
    }

}
