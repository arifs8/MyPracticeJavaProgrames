package Arrays.Leedcode;

public class TeoArrayEquals {

	public static void main(String[] args) {

        int[] arrayOne = {2, 5, 1, 7, 4};
          
        int[] arrayTwo = {2, 5, 1, 7, 4,7};
        
        twoArrayEqualsMethod(arrayOne, arrayTwo);

	}
	
	public static void twoArrayEqualsMethod(int[] arr1, int[] arr2) {
		
		boolean flar = true;
		
		if(arr1.length == arr2.length) {
			
			for(int i=0 ;i<arr1.length;i++) {
				
				if(arr1[i] != arr2[i]) {
					flar = false;
				}
			}
		}
		
		else {
			flar = false;
		}
		
		if(flar) {
			
			System.out.println("Both the arrays are equal");
		}else {
			System.out.println("Both the arrays are not equal");
		}
	}

}
