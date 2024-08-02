package MathForCoding;

public class SumMultiples {

	public static void main(String[] args) {
		int num=7;
		System.out.println("Sum of all the integers : "+ sumOfMultplication(num));

	}
	
	public static int sumOfMultplication(int n) {
		
		
		int sum=0;
		for(int i=1; i<=n;i++) {
			
			if(i%3==0 || i%5==0 || i%7==0) {
				
				sum = sum+i;
			}
		}
		return sum;
	}

}
