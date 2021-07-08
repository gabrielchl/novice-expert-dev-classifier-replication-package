import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        int[] c=new int[p.length];

        for(int i=1;i<=p.length;i++){

            for(int j=0;j<p.length;j++){

                if(i==p[j]){
                    int next=j+1;

                    for(int z=0;z<p.length;z++){


                        if(next==p[z]){

                            c[i-1]=z+1;



                        }

                    }

                }


            }

        }
        return c;


    }

}
