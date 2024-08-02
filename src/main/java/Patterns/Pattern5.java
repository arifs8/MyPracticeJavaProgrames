package Patterns;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pass the NUmber of lines: ");
		int n = sc.nextInt();
		
		patternSolution2(n);

	}
	
	public static void patternSolution1(int n) {
		
		
		for(int row=1; row<=2*n ;row++) {
			
			int totalRow = row >n ? 2 * n - row  : row ;
			
			for(int col=1; col<=totalRow; col++) {
				
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
	}
	
	
	public static void patternSolution2(int rows) {
		

        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
 
            System.out.println();
        }
 
        //Printing lower half of the pattern
 
        for (int i = 2; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
 
            System.out.println();
        }
 
	}
}
