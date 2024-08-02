package ArraysPart1;

public class EqualityOfTwoArrays {

	public static void main(String[] args) {

		int[] arr1 = {2,5,1,4,7};
		int[] arr2 = {2,5,1,4,7};
		
		if(equalityArray(arr1, arr2)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

	}
	
	public static boolean equalityArray(int[] arr1 ,int[] arr2) {
	
		
		boolean equalOrNot = true;
		
		if(arr1.length == arr2.length) {
			
			for(int i=0 ;i<arr1.length ;i++) {
				
				if(arr1[i] != arr2[i]) {
					equalOrNot =false;
				}
			}
		}else {
			equalOrNot= false;
		}
		return equalOrNot;
	}

}
