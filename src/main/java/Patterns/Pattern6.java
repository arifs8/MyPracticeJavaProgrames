package Patterns;

import java.util.Scanner;

public class Pattern6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pass the NUmber of lines: ");
		int n = sc.nextInt();
		
		patternSolution1(n);

	}
	
	public static void patternSolution1(int n) {
		
		
		for(int row=1; row<=2*n ;row++) {
			
			int totalRow = row >n ? 2 * n - row  : row ;
			
			int space  = n - totalRow;
			for(int s =1 ; s<=space ;s++) {
				System.out.print(" ");
			}
			
			for(int col=1; col<=totalRow; col++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
