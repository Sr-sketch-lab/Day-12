package com.codegnan.Patternexamples;

public class Pattern_03 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print(" * ");
				//System.out.print(j+ " ");
				//System.out.print((5-j)+ " ");
				//System.out.print(i+" ");
				//System.out.print((5-i)+"  ");
				//System.out.print((char)(97+j)+" ");
				//System.out.print((char)(101-j)+" ");
				//System.out.print((char)(97+i)+" ");
				//System.out.print((char)(101-i)+" ");
			}
			System.out.println();
		}

	}

}
