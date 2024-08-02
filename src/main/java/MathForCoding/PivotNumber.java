package MathForCoding;

/*
 * 
 * 
 * Given a positive integer n, find the pivot integer x such that:

The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one pivot index for the given input.

Example 1:

Input: n = 8 
Output: 6
Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.
 */

public class PivotNumber {

	public static void main(String[] args) {
		int n=8;
		System.out.println(pivotNumbers(n));

	}
	
	public static int pivotNumbers(int n) {
		
		int rightSide = (n*n+n)/2;
		int x = (int) Math.sqrt(rightSide);
		
		if(x * x == rightSide) {
			return x;
			
		}else {
			return -1;
		}
	}

}


/*
 * Sum of 1 to X = Sum of X to 1;
 * sum of nuatural numbers are x(x+1)/2;
 * we need to find value X
 * Equation is Sum of 1 to X = Sum of X to 1;
 * x(x+1)/2 = n(n+1)/2 - x(x-1)/2; 
 * 
 * 
 */


