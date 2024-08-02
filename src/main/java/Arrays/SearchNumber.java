package Arrays;

public class SearchNumber {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int target =4;
		seaarchNumber(arr, target);

	}
	
	public static  boolean seaarchNumber(int[] arr, int target) {
		
		int n= arr.length;
		
		for(int i=0 ;i<n ;i++) {
			
			if(arr[i] == target ){
			
				return true;
			}
		}
		return false;
	}

}