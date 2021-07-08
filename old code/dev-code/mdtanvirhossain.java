import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        int pLength = p.length;

        int[] result = new int[pLength];
        int resultIndex = 0;

        for (int i = 1; i <= pLength; i++) {

            for (int j = 1; j <= p.length; j++) {

                if (i == p[j - 1]) {

                    for (int j2 = 1; j2 <= result.length; j2++) {

                        if (j == p[j2 - 1]) {

                            result[resultIndex] = j2;
                            resultIndex++;

                        }

                    }

                }

            }

        }

        return result;

    }

}
