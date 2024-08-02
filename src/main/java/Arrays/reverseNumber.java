package Arrays;

public class reverseNumber {
	
	public static void main(String[] args) {
		
		int num = 1468;
		System.out.println(revNumber(num));
		
	}
	
	public static int revNumber(int num) {
		
		
		int y=0;
		while(num != 0) {
			
			int digit = num %10;
			num = num / 10 ;
			y = y* 10+digit;
		}
		return y;
	}

}
