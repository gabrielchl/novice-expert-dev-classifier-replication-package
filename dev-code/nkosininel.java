import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int len=p.length;
        int inum=0;
        int result[]=new int[len];
        for(int i=1;i<=len;i++){
            for(int j=0;j<len;j++){
                if(p[j]==i){inum=j+1;break;}
            }
            for(int j=0;j<len;j++){
                if(p[j]==inum){inum=j+1;break;}
            }
            result[i-1]=inum;
        }
        return result;

    }

}
