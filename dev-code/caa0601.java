import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

                int length = p.length;
        int k = 0;
        int[] result = new int[length];
        for(int i=0; i<length;i++){
            for(int j=0; j<length;j++){
                if(p[p[j]-1]==(i+1)){
                    result[k++]=j+1;
                }
            }
        }
        return result;

    }

}
