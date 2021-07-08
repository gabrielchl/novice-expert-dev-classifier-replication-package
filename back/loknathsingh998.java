import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int ar[] = new int[p.length];

        for(int i = 0;i<p.length; i++)
        {
            int x = p[i];

            for(int j  =0; j<p.length; j++)
            {
                if(p[j]==(i+1))
                {
                    for(int k=0;k<p.length; k++)
                    {
                        if(p[k]==(j+1))
                        {
                            ar[i]=k+1;
                            break;
                        }
                    }

                    break;
                }

            }
        }
        return ar;
    }

}
