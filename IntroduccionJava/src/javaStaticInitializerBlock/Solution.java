package javaStaticInitializerBlock;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	private static boolean flag;
	private static final int B;
	private static final int H;
	
	static {
		Scanner in = new Scanner(System.in);		
		
		B = in.nextInt();
		H = in.nextInt();
		
		flag = (B > 0 && H > 0)? true : false;
		
		if (!flag)
			System.out.println("java.lang.Exception: Breadth and height must be positive");		
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}

}