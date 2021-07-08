import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
                  int[] newArray = new int[p.length];
                  for(int i=0;i<p.length;i++){
                      int j= p[i];
                     int index = p[j-1];
                     newArray[index-1] = i+1;
                  }
                  return newArray;
    }

}
