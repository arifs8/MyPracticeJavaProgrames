package Patterns;

import java.util.Scanner;

public class Pattern7 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pass the NUmber of lines: ");
		int n = sc.nextInt();
		
		patternSolution1(n);

	}
	
	public static void patternSolution1(int n) {
		
		
		for(int row=1; row<=n ;row++) {
			
			int space = n - row;
			for(int s=1 ; s<=space ; s++) {
				System.out.print(" ");
			}
			
			for(int col=1; col<=row; col++) {
				
				System.out.print(col + " `");
			}
			System.out.println();
		}
		
	}

}
