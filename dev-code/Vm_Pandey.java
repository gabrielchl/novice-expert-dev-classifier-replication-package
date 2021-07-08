import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        List<Integer> al = new ArrayList<>(p.length);
        for(int x: p) {
            al.add(x);
        }
        for(int i=0; i<al.size(); i++) {
            int temp = al.indexOf(i+1);
            int flag = al.indexOf(temp+1);
            p[i] = flag+1;
        }
        return p;
    }

}
