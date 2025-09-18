package com.codegnan.Patternexamples;

public class DiamondPattern {

	public static void main(String[] args) {
		int rows=5;
		//part1 upper part of the diamond
		for(int i=1;i<=rows;i++) {//outer loop for rows(1 to 5)
			
			//inner loop 1:print leading spaces
			for(int j=1;j<=rows-i;j++) {
				System.out.print("  ");//two spaces
			}
			//inner for loop 2 print stars
			for (int k=1;k<=2*i-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//lower part of the diamond pattern
		for(int i=rows-1;i>=1;i--) {
			//inner for loop 1:
			for(int j=1;j<=rows-i;j++) {
				System.out.print("  ");//two spaces
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
