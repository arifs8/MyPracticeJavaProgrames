package MathForCoding;

import java.util.Arrays;

/*
 * 
//Minimum Sum of Four Digit Number After Splitting Digits

Example 1 :
Input: num = 2932 
Output: 52
Explanation: Some possible pairs [new1, new2] are [29, 23], [223, 9], etc.

The minimum sum can be obtained by the pair [29, 23]: 29 + 23 = 52.






*/
public class MinimumSum {

	public static void main(String[] args) {

		int num = 2932;
		System.out.println(minimumSum(num));

	}
	
	public static int minimumSum(int num) {
		
		int digits[] = new int[4];
		
		int index=0;
		
		while(num > 0) {
			
			int currentIndex =num % 10;
			digits[index] = currentIndex;
			index++;
			num = num / 10;
		}
		
		Arrays.sort(digits);
		
		int FirstSum = digits[0] * 10 + digits[2];
		int SecondSum = digits[1] * 10 + digits[3];
		int sum =FirstSum + SecondSum ;
		return sum;
	}

}
