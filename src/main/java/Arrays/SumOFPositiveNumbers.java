package Arrays;

public class SumOFPositiveNumbers {

	public static void main(String[] args) {
		int[] arr = {-2, -1 ,0 ,1,2,4,7,9};
		System.out.println(positiveNumber(arr));
		
	}
	
	public static int positiveNumber(int[] arr) {
		
		int n = arr.length;
		int sum =0;
		
		for(int i=0 ;i<n ;i++) {
			
			if(arr[i] > 0 ) {
				
				sum = sum +arr[i];
			}
		}
		
		return sum;
	}

}
