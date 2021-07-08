import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<p.length; i++){
            map.put( p[i], i+1 );
        }

        int[] res = new int[p.length];

        for(int i=0; i<p.length; i++){

            res[i] = map.get( map.get(i+1) );
        }
        return res;
    }

}
