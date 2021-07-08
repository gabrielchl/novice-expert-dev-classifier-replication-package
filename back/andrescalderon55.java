import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p)
    {
        int[] r=new int[p.length];
        for(int x:p)
        {
            r[p[p[x-1]-1]-1]=x;
        }
        return r;
    }

}
