package com.codegnan.Patternexamples;

public class ButterflyPattern {

	public static void main(String[] args) {
		
		//Part1 upper part of the butterfly pattern
		int rows=5;
		for(int i=1;i<=rows;i++) { //outer for loop
			//inner loop1:print the stars for left wing
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			//inner for loop 2: print spaces between left wing and right wing
			int spaces=2*(rows-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print("   ");
			}
			//inner for loop 3:print the stars for right wing
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		
		//lower part of the butterfly pattern
		for(int i=rows;i>=1;i--) {
			//inner for loop 1 print stars as left wing in bottom part
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			//inner for loop 2 print the spaces between bottom part
			int spaces =2*(rows-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print("   ");
			}
			//inner for loop3 print the stars as right wing in bottom part
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
