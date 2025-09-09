package com.codegnan.Patternexamples;

public class Pattern_01 {

	public static void main(String[] args) {
		//outer for loop talks about rows that means i
		for(int i=1;i<=5;i++) {
			
			//inner for loop talks about columns that means j
			for(int j=1;j<=5;j++) {
				System.out.print(" * ");
				//System.out.print(j+ " ");
				//System.out.print((6-j)+" ");
				//System.out.print(i+" ");
				//System.out.print((6-i)+"  ");
				//System.out.print((char)(96+j)+" ");
				//System.out.print((char)(102-j)+" ");
				//System.out.print((char)(96+i)+" ");
				//System.out.print((char)(102-i)+" ");
			}
			System.out.println();//move to the next row
		}

	}

}
