import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
int[]res = new int[p.length];
HashMap<Integer,Integer>hmap = new HashMap<>();
for(int i = 0;i < p.length;i++)
{
hmap.put(p[i],i+1);
}
int j = 0;
for(int i = 0;i < p.length;i++)
{
res[j++] = hmap.get(hmap.get(i+1));
}
return res;
    }
}
