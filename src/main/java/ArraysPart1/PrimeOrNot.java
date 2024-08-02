package ArraysPart1;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println(isPrime(num));
		System.out.println(isPrimeSqrt(num));
		System.out.println(isPrimeThrid(num));

	}
	
	public static boolean isPrime(int num) {
		
		
		for(int i=2; i<=num/2; i++) {
			
			if(num%i ==0 ) {
				
				return false;
			}
		}
		
		return true;
	}
	
	
	
	public static boolean isPrimeSqrt(int num) {
		
		
		for(int i=2; i<=Math.sqrt(num); i++) {
			
			if(num%i ==0 ) {
				
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isPrimeThrid(int num) {
		
		if(num ==1) {
			return false;
		}
		
		if(num ==2 || num ==3) {
			return true;
		}
		
		if(num%2==0 || num%3==0) {
			return false;
		}
		
		for(int i=5; i<=Math.sqrt(num); i=i+6) {
			
			if(num%i ==0 || num%(i+2) == 0) {
				
				return false;
			}
		}
		
		return true;
	}

}
