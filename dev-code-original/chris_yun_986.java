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
    //     int[] indexs = new int[p.length];
    //     int[] ret = new int[p.length];
    //     int target = -1;

    //     for (int i = 0; i < p.length; i++) {
    //         indexs[i] = findIndex(p,i+1);
    //     }
    //     for (int i = 0; i < p.length; i++) {
    //         ret[i] = findIndex(indexs,i+1);
    //     }

    // return ret;

        int[] ret = new int[p.length];
        int[] pInverse = new int[p.length+1];
        for (int i = 1; i <= p.length; i++) {
            pInverse[p[i-1]] = i;
        }

        for (int i = 1; i <= p.length; i++) {
            ret[i-1] = pInverse[pInverse[i]];
        }
        return ret;
    }

    // static int findIndex(int[] arr, int target) {
    //     int i = 0;
    //     while (i < arr.length) {
    //         if (target == arr[i])
    //             return i+1;
    //         else i++;
    //     }
    //     return -1;
    // }

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
