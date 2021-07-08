import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] q = new int[p.length];

        for(int x=1;x<=p.length;x++)
        {
            for(int i=0;i<p.length;i++)
            {
                if(x==p[i])
                {
                    for(int j=0;j<p.length;j++)
                    {
                        if(i+1==p[j])
                        q[x-1]=j+1;
                    }
                }
            }
        }

        return q;

    }

}
