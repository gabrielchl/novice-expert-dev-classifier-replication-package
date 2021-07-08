import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] order = new int[p.length];
        int index = 0;
        for(int i=0; i<p.length; i++){
            for(int j=0; j<p.length; j++){
                if(p[p[j]-1]==i+1){
                    order[index]=j+1;
                    index++;
                    break;
                }
            }
        }
        return order;
    }

}
