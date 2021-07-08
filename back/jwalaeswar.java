import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] pin = new int[p.length+1];
        for(int i = 1; i <= p.length; i++){
            pin[p[i-1]] = i;
        }
        int[] temp = new int[p.length];
        for(int i = 1; i <= p.length; i++){
            temp[i-1] = pin[pin[i]];
        }
        return temp;
    }

}
