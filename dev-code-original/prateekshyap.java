import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the permutationEquation function below.
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

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];

        String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        int[] result = permutationEquation(p);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
