package ArraysPart1;

import java.util.Arrays;

public class FindTheMissingNumbers {

	public static void main(String[] args) {
		int n = 8;

		int[] a = { 1, 4, 5, 3, 7, 8, 6 };
		

		System.out.println("The missing number is : " + findMissingNumber(a, n));
 
	}

	public static int findMissingNumber(int[] arr, int n) {
		
		int expected = n*(n+1)/2;
		
		int actualSum =0;
		
		for(int num : arr) {
			
			actualSum = actualSum + num ;
		}
		
		return expected - actualSum ;
		
	}

}
