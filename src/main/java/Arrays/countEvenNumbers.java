package Arrays;

public class countEvenNumbers {

	public static void main(String[] args) {

		int count =0 ;
		
		int[] arr = {1,2,3,4,24,12};
		
		for(int i=0 ;i< arr.length ; i++) {
			
			if(arr[i] % 2 ==0) {
				
				count++;
			}
		}
		
		System.out.println("The number of posiitve numbers are: " + count);

	}

}
