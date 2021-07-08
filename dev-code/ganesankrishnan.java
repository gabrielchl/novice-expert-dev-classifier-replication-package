import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        int len = p.length;
        int[] indexes = new int[len+1];
        for(int i = 0 ; i < len ; i++) {
            indexes[p[i]] = i+1;
        }

        //System.out.println(Arrays.toString(indexes));

        int[] answer = new int[p.length];
        for(int x = 1 ; x <= p.length ; x++) {

            int indexOfX = indexes[x];
            //System.out.println("indexOfX=" + indexOfX);
            int indexOfIndexOfX = indexes[indexOfX];
            //System.out.println("indexOfIndexOfX=" + indexOfIndexOfX);
            answer[x-1] = indexOfIndexOfX;
        }
        //System.out.println(Arrays.toString(answer));
        return answer;
    }

}
