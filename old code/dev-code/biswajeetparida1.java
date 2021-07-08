import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] q = new int[p.length];
    for(int i: p){
        q[p[p[i-1]-1]-1] = i;
    }
    return q;

    }

}
