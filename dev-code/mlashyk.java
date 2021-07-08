import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
int n = p.length;
int [] r = p.clone();
int index = 0;
for (int x=1;x<=n;x++)
{
    for (int i=0; i<n; i++)
        {
            if (p[i]==x)
            {
                index = i+1;
             //   System.out.println("<"+index+">");
                for (int j=0;j<n;j++)
                {
                    if (p[j]==index)
                    {
                        r[x-1]=j+1;
                        break;
                    }

                }
            break;
             }
        }
//    System.out.println("x="+x+";");
}
return r;
    }

}
