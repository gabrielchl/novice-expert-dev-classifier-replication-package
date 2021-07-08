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
        for(int i = 0; i < p.length; i++){
            map.put(p[i], i + 1);
        }
        System.out.println(map);
        int[] result = new int[p.length];
        for(int i = 1; i <= p.length; i++) {
            result[i - 1] = map.get(map.get(i));
        }

        return result;
    }

}
