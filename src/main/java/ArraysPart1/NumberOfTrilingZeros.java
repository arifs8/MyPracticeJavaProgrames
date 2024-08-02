package ArraysPart1;

import java.util.Scanner;

public class NumberOfTrilingZeros {

	public static void main(String[] args) {
		Scanner scna = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scna.nextInt();
		
		System.out.println(trilingZeros(n));

	}
	
	public static int trilingZeros(int n) {
		
		int result =0;
		
		int powerOf5 = 5;
		
		while( n>= powerOf5) {
			
			result = result + (n / powerOf5);
			powerOf5 = powerOf5 * 5;
		}
		
		return result;
		
	}

}
