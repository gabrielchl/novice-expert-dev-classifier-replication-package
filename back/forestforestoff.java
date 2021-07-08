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
        for (int value : p) {
            result[p[p[value - 1] - 1] - 1] = value;
        }
        return result;
    }

}
