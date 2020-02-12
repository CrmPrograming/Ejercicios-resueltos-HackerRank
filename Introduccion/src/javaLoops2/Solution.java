package javaLoops2;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();        
        for(int i = 0; i < q; i++){
        	int sActual = 0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
            	sActual = a;            	
            	for (int k = 0; k <= j; k++)
            		sActual += ((int) Math.pow(2, k)) * b;
            	System.out.print(sActual + " ");
            }
            System.out.println();
        }
        in.close();
    }
}