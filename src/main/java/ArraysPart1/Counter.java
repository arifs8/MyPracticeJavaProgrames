package ArraysPart1;

import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
		
		//int ans = 2345;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please provide the number :  " );
		int n = scan.nextInt();
		
		System.out.println("The number of digits is : " + count(n));

	}
	
	public static int count(int n) {
		
		int count =0;
		
		while( n > 0) {
			
			n= n /10;
			count++;
		}
		
		return count;
	}

}
