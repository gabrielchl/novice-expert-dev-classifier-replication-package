import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] arrayScores) {
        int[] result = new int[arrayScores.length];
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<arrayScores.length;i++){
            map.put(arrayScores[i],i);
        }

        for(int i=1;i<=result.length;i++){
            int y=map.get(map.get(i)+1)+1;
            result[i-1]=y;
        }

        return result;
    }

}
