import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] hashTable = new int[100];
        int[] q = new int[p.length];
        for (int i = 0; i < p.length; ++i)
        {
            hashTable[p[i]] = i+1;
        }
        int x = 0;
        for (int i = 0; i < hashTable.length; ++i)
        {
            if (hashTable[i] != 0)
                q[x++] = hashTable[i];
        }
        for (int i = 0; i < q.length; ++i)
            System.out.print(q[i]+" ");
        System.out.println();
        for (int i = 0; i < p.length; ++i)
        {
            hashTable[p[i]] = i;
        }
        for (int i = 0; i < p.length; ++i)
        {
            q[i] = hashTable[q[i]]+1;
        }
        for (int i = 0; i < q.length; ++i)
            System.out.print(q[i]+" ");
        System.out.println();
        for (int i = 0; i < hashTable.length; ++i)
            System.out.print(hashTable[i]+" ");
        System.out.println();
        return q;
    }

}
