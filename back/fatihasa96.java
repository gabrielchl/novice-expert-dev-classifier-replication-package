import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {


        List<Integer> targetList = new ArrayList<>(p.length);

        for (int i : p) {
            targetList.add(Integer.valueOf(i));
        }
        int returnArray[] = new int[p.length];
        for(int i = 1; i<=p.length ; i++){
            returnArray[i-1] = targetList.indexOf(targetList.indexOf(i)+1)+1;
        }
        return returnArray;
/*
        HashMap<Integer<Integer>> map = new HashMap<Integer<Integer>>();
        int returnArray[] = new int[p.length];

        for(int i = 0; i<p.length ; i++){

            map.add(i+1,p[i]);
        }

        for(int i = 1; i<p.length ; i++){

            returnArray[i-1] =
        }

  */

    }

}
