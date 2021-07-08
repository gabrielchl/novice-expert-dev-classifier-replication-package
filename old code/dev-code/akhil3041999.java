import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        int[] arr=new int[p.length];
    for(int i=0;i<p.length;i++)
    {

        for(int j=0;j<p.length;j++)
        {
            if(i+1==p[j])
            {
                arr[p[i]-1]=j+1;
                break;
            }

        }
    }
    return arr;

    }

}
