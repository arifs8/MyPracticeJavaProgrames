package Arrays;

public class sumOfAllNumbers {

	public static void main(String[] args) {
		int num =11056;
		System.out.println(numberCounts(num));

	}
	
	public static int numberCounts(int num) {
		
		int sum=0;
		
		while( num != 0) {
			
			sum=sum+ num %10;
			num = num /10;
		}
		return sum;
	}

}
