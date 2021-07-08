import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] arr = new int[p.length];
        List<Integer> ll = new ArrayList<Integer>();

        for(int i = 0; i<p.length; i++){
            ll.add(p[i]);
        }

        for(int x = 1; x<=ll.size(); x++){
            int index = ll.indexOf(x) + 1;
            int index2 = ll.indexOf(index) + 1;
            arr[x-1] = index2;
        }

        return arr;


    }

}
