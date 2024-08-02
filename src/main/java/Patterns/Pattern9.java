package Patterns;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pass the NUmber of lines: ");
		int n = sc.nextInt();
		
		patternSolution9(n);

	}

	public  static void patternSolution9(int n) {


		for(int row=1 ;row<=n ;row++) {
			
			for(int col=1; col<=row ; col++) {
				
				System.out.print(col + " ");
			}
			
			for(int col=row-1; col>=1 ;col-- ) {
				System.out.print(col + " ");
			}
			
			System.out.println(" ");
		}
		
	}

}
