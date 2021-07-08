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
        int[] tempresult = new int[p.length];
        int index = 0;


        for (int x = 0; x <= p.length - 1; x++) {
            index = p[x] - 1;
            tempresult[index] = x + 1;
        }
        for (int x = 0; x <= p.length - 1; x++) {
            index = tempresult[x] - 1;
            result[x] = tempresult[index] ;
        }




        return result;
    }

}
