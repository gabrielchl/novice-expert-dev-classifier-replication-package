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

        for (int i = 0; i < p.length; i++) {
           result [i] = getY(i + 1 ,i + 1,p);
        }
        return result;

    }

    static int getY (int x,int initX,int[] p) {
        if (p[p[x - 1] - 1] == initX) {
            return x;
        }
        return  getY(p[p[x -1] -1], initX,p);
    }

}
