package Patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pass the NUmber of lines: ");
		int n = sc.nextInt();
		
		patternSolution1(n);

	}
	
	public static void patternSolution1(int n) {
		
		
		for(int row=1; row<=n ;row++) {
			
			for(int col=1; col<=row; col++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
