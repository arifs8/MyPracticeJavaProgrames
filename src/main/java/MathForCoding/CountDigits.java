package MathForCoding;

public class CountDigits {

	public static void main(String[] args) {
		int num = 121;
		System.out.println("The sum of digits are : " + coutNumofDigits(num));

	}
	
	public static int coutNumofDigits(int num) {
		
		int count=0;
		 int originalNum = num;
		 
		 while(num > 0) {
			 
			 int lastdigit = num % 10;
			 if(originalNum % lastdigit == 0) {
				 count=count+1;
			 }
			 num = num /10;
		 }
		return count;
		
		
	}
}
