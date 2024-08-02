package ArraysPart1;

import Arrays.reverseNumber;
import Arrays.reverseOfArray;

public class ReversTheArray {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		
		
		reversArray(array);
	        System.out.println("Reversed array:");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }

	}
	
	public static int[] reversArray(int[] array) {
		
		
		int start=0;
		int last = array.length-1;
		
		while(start < last) {
			
			int temp = array[start];
			array[start] = array[last];
			array[last] = temp;
			
			start++;
			last--;
		}
		return array;
	}

}
