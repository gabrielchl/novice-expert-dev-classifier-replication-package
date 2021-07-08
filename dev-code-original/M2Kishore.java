import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    static int getPos(int[] n, int key){
        for(int i=0;i<n.length;i++){
            if(n[i]==key){
                return i;
            }
        }
        return -1;
    }
    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {
            
            HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
            int n=p.length;
            int d=0;
            int result[]=new int[n];
        for(int i=1;i<=n;i++){
               mp.put(p[d],i);
               d++;
        }
        d=0;
         for(int i=1;i<=n;i++){
            result[d]=mp.get(mp.get(i));
            d++;
         }
         return result;

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
