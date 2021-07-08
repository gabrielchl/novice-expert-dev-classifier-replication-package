import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] res=new int[p.length+1];
        int[] result=new int[p.length];
        int temp=0;
        for(int x=1;x<=p.length;x++){
            res[p[temp++]]=x;
        }
        int index=0;
        for(int x=1;x<=p.length;x++){
            result[index++]=res[res[x]];
        }
    return result;


    }

}
