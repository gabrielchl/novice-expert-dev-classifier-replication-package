import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        ArrayList<Integer> result_arrList = new ArrayList<Integer>();
        for(int a=0; a<p.length; a++)
        {
            for(int i=0; i<p.length; i++)
            {
                int hamadah = 0;
                if(p[i] == a+1)
                {
                    hamadah = i+1;
                }
                for(int z=0; z<p.length; z++)
                {
                    if(p[z]==hamadah)
                    {
                        result_arrList.add(z+1);
                    }
                }
            }
        }

        return result_arrList.stream().mapToInt(i->i).toArray();
    }

}
