package Arrays;

public class countNumbers {

	public static void main(String[] args) {

		int number = 11056;
		System.out.println(numberCount(number));
	}
	
	public static int numberCount(int num) {
		
		int count =0;
		while(num != 0) {
			
			num = num / 10 ;
			count++;
		}
		return count;
	}

}
