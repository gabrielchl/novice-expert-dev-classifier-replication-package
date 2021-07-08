import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] result = new int[p.length];
        List<Integer> input = new ArrayList<Integer>(p.length);
        for (int c : p) {
            input.add(c);
        }

        for (int i = 1; i <= p.length; i++) {
            int index = input.indexOf(i) + 1;
            result[i - 1] = input.indexOf(index)+1;
            System.out.println(result[i - 1]);
        }

        return result;

    }

}
