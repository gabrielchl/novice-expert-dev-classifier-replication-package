import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
         int[] resultArr = new int[p.length];
    for(int i=0; i<p.length; i++) {
        resultArr[p[p[p[i]-1]-1]-1] = p[i];
    }

    return resultArr;

}



}
