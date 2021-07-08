import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] outputs = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            System.out.println("Calculating value for number " + i);
            outputs[i] = returnIndexOf(p, returnIndexOf(p, i + 1));
        }
        return outputs;
    }

    static int returnIndexOf(int[] p, int valueInArray) {
        System.out.println("valueInArray = " + valueInArray);
        for (int i = 0; i < p.length; i++) {
            if (p[i] == valueInArray) {
                System.out.println("i = " + (i + 1));
                return i + 1;
            }
        }
        return -1;
    }

}
