package MathForCoding;

public class GCD {

	public static void main(String[] args) {
		int num[] = {2,5,6,9,10};
		System.out.println(findGCD(num));

	}
	
	public static int findGCD(int[] nums) {
		
		int smallestNum = nums[0];
		int largestNum = nums[0];
		
		return gcd(smallestNum, largestNum);
	}
	
	public static int gcd(int a , int b) {
		
		int gcdOfTwoNum =1;
		
		for(int i=2; i<= Math.min(a, b); i++) {
			
			if(a%i == 0 && b%i ==0) {
				gcdOfTwoNum = i;
			}
		}
		return gcdOfTwoNum;
	}

}
