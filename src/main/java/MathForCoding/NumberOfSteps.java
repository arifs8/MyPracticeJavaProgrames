package MathForCoding;

public class NumberOfSteps {

	public static void main(String[] args) {
		int num = 16;
		System.out.println("The number of steps are : " + numberOfStep(num));

	}
	
	public static int numberOfStep(int num) {
		
		int count = 0;
		int temp = num;
		
		while(temp != 0) 
			if( temp % 2 ==0) {
				temp = temp /2;
				count++;
			}else {
				temp =temp -1;
				count++;
			}
		return count;
		
	}

}
