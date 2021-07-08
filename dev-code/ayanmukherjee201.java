import java.io.*;
import java.util.stream.Collectors;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] result = new int[p.length];
        List<Integer> numList = Arrays.stream(p).boxed().collect(Collectors.toList());

        for(int i = 0; i < p.length; i++) {
            int index = numList.indexOf(i + 1) + 1;
            index = numList.indexOf(index) + 1;
            result[i] = index;
        }

        return result;
    }

}
