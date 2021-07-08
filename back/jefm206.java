import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] sequenceMap = new int[p.length+1];
        int[] permutations = new int[p.length];
        for (int i=0; i<p.length; i++) {
            sequenceMap[p[i]]= i+1;
        }
        for (int j=1; j< sequenceMap.length; j++) {
            int element = sequenceMap[j];
            permutations[j-1]=sequenceMap[element];
        }
        return permutations;
    }

}
