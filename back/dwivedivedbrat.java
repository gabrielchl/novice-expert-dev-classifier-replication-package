import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int arr[]=new int[p.length];
        int index=0;
        for(int i=1;i<=p.length;i++)
        {

            for(int j=0;j<p.length;j++)
            {
                if(p[j]==i)
                {
                    int val=j+1;
                    for(int k=0;k<p.length;k++)
                    {
                        if(p[k]==val)
                        {
                            arr[index++]=k+1;
                        }
                    }
                    break;
                }
            }
        }
        return arr;


    }

}
