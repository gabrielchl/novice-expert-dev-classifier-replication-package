import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : p) {
            list.add(i);
        }
        int[] x = new int[p.length];
        for (int i = 0; i < list.size(); i++) {
            int temp = list.indexOf(i+1);
            int needed = list.indexOf(temp+1);
            x[i] = needed+1;
        }
        return x;
    }

}
