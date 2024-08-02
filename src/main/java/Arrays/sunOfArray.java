package Arrays;

public class sunOfArray {

	public static void main(String[] args) {
		int[] arr = {1,4,2};
		int sum=0;
		
		for(int i=0; i<arr.length ;i++) {
			
			sum= sum +arr[i];
		}
		
		System.out.println("Sum of the array is : " + sum);

	}

}
