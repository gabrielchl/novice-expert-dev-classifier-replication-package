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
        int [] tmp = new int[p.length+1];
        for(int j=1;j<tmp.length;j++){
            tmp[j] = p[j-1];
        }
        Arrays.sort(tmp);
        int o_p,o_p_1,fvar =0;
        int [] final_array = new int[p.length];
        for(int i=1;i<=tmp[p.length];i++){
            o_p = 0;
            for(int k=0;k<p.length;k++){
                if(p[k] == tmp[i]){
                    o_p = k+1;
                }
            }
            o_p_1 = 0;
            for(int m =0;m<p.length;m++){
                if(o_p == p[m]){
                    o_p_1 =  m+1;
                }
            }
            final_array[fvar++] = o_p_1;
        }
        
        return final_array;

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
