import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int getArrayofArray(int index, int[] p){
        int secondIndex = p[index-1];
        int valueOfSecondIndex = p[secondIndex-1];
        return valueOfSecondIndex;
    }
    static int[] permutationEquation(int[] p) {

        int[] output = new int[p.length];
        for(int i: p){
            int arrayofArray = getArrayofArray(i, p);
            output[arrayofArray-1] = i;
        }
        return output;
    }

}
