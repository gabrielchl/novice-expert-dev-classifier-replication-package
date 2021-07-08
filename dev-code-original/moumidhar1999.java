import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.List; 
public class Solution {
    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {
    List<Integer> al = new ArrayList<Integer>(p.length);
    for (int i : p)
        {
            al.add(i);
        }

        ArrayList<Integer> arl=new ArrayList<Integer>();
         for(int i=1;i<=p.length;i++)
          {
              int index=al.indexOf(i);
              int index1=al.indexOf(index+1);
              arl.add(index1+1);
          }  
        
        
        
        int arr[]=new int[p.length];
        for(int i=0;i<p.length;i++)
        {
            arr[i]=arl.get(i);
        }

   return arr;
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