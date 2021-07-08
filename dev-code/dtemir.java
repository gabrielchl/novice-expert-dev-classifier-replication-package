import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        int[] answer = new int[p.length];

        for (int x = 1; x <= p.length; x++){
            int index = 0;
            for (int i = 0; i < p.length; i++){
                if (p[i] == x){
                    index = ++i;
                }
            }
            int y = 0;
            for (int i = 0; i < p.length; i++){
                if (p[i] == index){
                    y = ++i;
                }
            }
            answer[x - 1] = y;
        }

        return answer;
    }

}
