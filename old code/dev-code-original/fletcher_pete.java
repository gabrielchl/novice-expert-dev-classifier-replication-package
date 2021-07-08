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

        int n = p.length;  // numb elements in sequence
        int[] toRet = new int[p.length];

        for (int value = 1; value <= n; value++) {
            int indexOfValue = findIndexOfValue(value, p);
            if (indexOfValue >= 0) {
                int indexOfIndexOfValue = findIndexOfValue(indexOfValue, p);
                toRet[value - 1] = indexOfIndexOfValue;
            }
        }

        return toRet;
    }

    static int findIndexOfValue(int value, int[] p) {
        System.out.println("Looking for index of " + value);
        for (int index = 0; index<p.length; index++) {
            if (p[index] == value) {
                System.out.println("Found index of " + value + " at " + (index+1));
                return index+1;
            }
        }
        return -1;
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
