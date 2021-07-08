import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int n, int[] p) {
        int[] new_p = new int[n];

        for(int i=1; i<=n; i++){                    // i = x
            for(int j=1; j<=n; j++){                // p[j] = i = x
                if(p[j-1] == i){
                    for(int k=1; k<=n; k++){
                        if(p[k-1] == j){            // p[k] = j
                            new_p[i-1] = k;
                        }
                    }
                }
            }
        }

        return new_p;
    }

}
