import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int [] byValue = new int[p.length];
        int [] result = new int[p.length];
        for(int i = 0; i < p.length; i++){
            byValue[p[i] - 1] = i + 1;
        }

        for(int i = 1; i<= p.length; i++){
            int index = byValue[i - 1];
            result[i - 1] = byValue[index - 1];
        }
        return result;
    }

}
