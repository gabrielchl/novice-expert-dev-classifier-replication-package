import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class Solution {

    static int[] permutationEquation(int[] p)
    {
        int[] result = new int[p.length];
        List<Integer> pList = Arrays.stream(p).boxed().collect(Collectors.toList());
        for(int i=1;i<=p.length;i++)
        {
            int index = pList.indexOf(i);
            int element = index+1;
            index = pList.indexOf(element);
            result[i-1] = index+1;
        }
        return result;
    }

}
