package Arrays;

public class minNumber {

	public static void main(String[] args) {
int[] arr = {11,27,16,78};
		
		int min =arr[0];
		
		for(int i=0; i<arr.length ;i ++) {
			
			if(min >arr[i]) {
				min =arr[i];
			}
		}
		
		System.out.println("The maximum number is : " + min);

	}

}
