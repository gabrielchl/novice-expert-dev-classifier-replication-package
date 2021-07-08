import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    static int[] permutationEquation(int[] p) {
        List<Integer> collect = Arrays.stream(p).boxed().collect(Collectors.toList());
        return IntStream.rangeClosed(1,p.length)
                .map(collect::indexOf)
                .map(it -> it +1)
                .map(collect::indexOf)
                .map(it -> it +1)
                .toArray();
    }
}
