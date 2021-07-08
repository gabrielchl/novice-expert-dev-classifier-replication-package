import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Arrays.*;
import java.util.concurrent.*;
import java.util.regex.*;
import org.apache.commons.lang3.ArrayUtils;

public class Solution {

    // Arrays.asList(theArray).indexOf(o)
    static int[] permutationEquation(int[] p) {
        int[] array= new int[p.length];
        // int ind1=0,ind2=0;
        // for(int i=1; i<=p.length;i++){
        //     for(int j:p){
        //         if(j==i){
        //             ind1=Arrays.asList(p).indexOf(j)+1;
        //             System.out.println(ind1);
        //             for(int k:p){
        //                 if(k==ind1){
        //                     ind2=Arrays.asList(p).indexOf(k)+1;
        //                     System.out.println(ind2);
        //                 }
        //             }
        //         }
        //     }
        //     array[i-1]=ind2;
        // }
        for(int i=1; i<=p.length;i++){
            //array[i-1]=Arrays.asList(p).indexOf(Arrays.asList(p).indexOf(i));
            array[i-1]=ArrayUtils.indexOf(p, ArrayUtils.indexOf(p,i)+1)+1;
        }


        return array;
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
