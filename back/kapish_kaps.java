import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        int temp[] = new int[p.length];
        int result[] = new int[p.length];
        for(int i =1;i<=p.length;i++)
        {
            for(int j =0;j<p.length;j++)
            {
                if(p[j] == i)
                temp[i-1] = j;
            }
            for(int j =0;j<p.length;j++)
            {
                if(temp[i-1]+1 == p[j])
                result[i-1] = j+1;
            }
        }

        return result;
    }

}
