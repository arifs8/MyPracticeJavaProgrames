package Arrays;

public class palendromeNumber {

	public static void main(String[] args) {
		
		int num = 167761;
		
		System.out.println(palindromeNUmber(num));
		
		if(num == palindromeNUmber(num)) {
			System.out.println("The given number is palindrome");
		}else {
			System.out.println("The given number is not a palindrome");
		}

	}
	
	public static  int palindromeNUmber(int num) {
		
		int y =0;
		
		while(num != 0) {
			
			int digit = num % 10 ;
			
			num = num / 10;
			
			y = y*10 + digit;
		}
		return y;
	}

}
