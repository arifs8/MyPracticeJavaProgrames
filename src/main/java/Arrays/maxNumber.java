package Arrays;

public class maxNumber {

	public static void main(String[] args) {
		
		int[] arr = {1,2,6,8};
		
		int max =arr[0];
		
		for(int i=0; i<arr.length ;i ++) {
			
			if(max <arr[i]) {
				max =arr[i];
			}
		}
		
		System.out.println("The maximum number is : " + max);
		
	}
}
