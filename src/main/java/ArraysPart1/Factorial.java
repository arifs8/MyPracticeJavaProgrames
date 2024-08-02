package ArraysPart1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		double n = scan.nextInt();
		
		System.out.println(facto(n));

	}
	
	public static double facto(double n) {
		
		
		double  result =1;
		
		for(int i=1; i<=n ;i++) {
			
			result = result * i ;
			
		}
		
		return result;
	}

}
