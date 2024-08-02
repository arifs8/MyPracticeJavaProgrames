package ArraysPart1;

import java.util.Scanner;

public class GCDAndHCF {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in);
		System.out.println("Wriet the number: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//System.out.println(gcd(a, b));
		
		System.out.println("print Euclid :" + euclidGCD(a, b));
		
	}
	
	
	public static int gcd(int a , int b) {
		
		int min =0;
		
		if( a<b ) {
			
			min =a;
		}else {
			
			min =b;
		}
		
		for(int i=min; i>=1; i--) {
			
			if(a%i == 0 && b%i ==0) {
				
				return i ;
			}
		}
		return 1;
		
	}
	
	
	public static int euclidGCD(int a , int b) {
		
		while(a!=b) {
			
			if(a > b) {
				
				a= a-b;
			}else {
				b= b-a;
			}
		}
		
		return a;
	}

}
