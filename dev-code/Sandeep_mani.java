import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        ArrayList<Integer> list = new ArrayList<Integer>(p.length);
        for (int i = 0; i < p.length; i++)
            list.add(Integer.valueOf(p[i]));

        for (int i = 1; i <= p.length; i++) {
            int p1 = list.indexOf(i);
            int p2 = list.indexOf(p1 + 1);
            p[i - 1] = p2 + 1;
        }
        return p;
    }

}
