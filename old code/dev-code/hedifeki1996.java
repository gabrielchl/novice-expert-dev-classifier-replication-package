import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {






        int [] result = new int [p.length];
            int number = 1;
            while (number <= p.length){
            for (int i = 0 ; i< p.length; i++){
                if (p[i] == number){
                    for (int j = 0; j< p.length; j++){
                        if(p[j] == i+1){
                            result[number-1] = j+1;
                        }
                    }
                }
            }
            number++;

            }

        return result;

    }

}
