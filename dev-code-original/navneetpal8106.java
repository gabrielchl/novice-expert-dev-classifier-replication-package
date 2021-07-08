import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static int search(int item,int arr[])
    {   
        int index=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(item==arr[i])
            {
              index=i;
              break; 
            }  
        }
        return index;
    }
    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {
        int max=0;
        int res[]=new int[p.length];
        for(int i=0;i<p.length;i++)
        {
            max=Math.max(max,p[i]);
        }
        for(int i=1;i<=max;i++)
        {
            int index=search(i,p)+1;
            int y=search(index,p)+1;
            res[i-1]=y;
        }
        return res;
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
