import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int x=0;
        int[] n=new int[p.length];
        int[] ne=new int[p.length];
        for(int j=0;j<p.length;j++){
            for(int i=0;i<p.length;i++){
            if(p[i]==j+1){
                n[j]=i+1;

            }


            }
        }
        for(int l=0;l<p.length;l++){
        for(int k=0;k<n.length;k++){
                if(n[l]==p[k]){
                    ne[l]=k+1;

                }}

        }
        return ne;




    }

}
