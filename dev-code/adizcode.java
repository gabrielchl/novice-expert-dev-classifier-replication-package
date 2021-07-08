import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        int[] results = new int[p.length];

        for (int x = 1; x <= p.length; x++) {

            for (int z = 1; z <= p.length; z++) {

                boolean flag = false;

                if (p[z-1] == x) {

                    for (int y = 1; y <= p.length; y++) {

                        if (p[y-1] == z) {
                            results[x-1] = y;
                            flag = true;
                            break;
                        }
                    }
                }

                if (flag) {
                    break;
                }
            }
        }

        return results;

    }

}
