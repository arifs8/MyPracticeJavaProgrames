package ArraysPart1;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] arrayA = new int[] {-7, 12, 17, 29, 41, 56, 79};
        
        int[] arrayB = new int[] {-9, -3, 0, 5, 19};
          
        int[] mergedArray = mergeArray(arrayA, arrayB);
          
        System.out.println("Array A : "+Arrays.toString(arrayA));
          
        System.out.println("Array B : "+Arrays.toString(arrayB));
          
        System.out.println("Merged Array : "+Arrays.toString(mergedArray));

	}

	public static int[] mergeArray(int[] arrayA, int[] arrayB) {


		int[] mergerdArray = new int[arrayA.length + arrayB.length];
		
		int i=0,j=0,k=0;
		
//		while( i<arrayA.length && j<arrayB.length) {
//			
//			if(arrayA[i] < arrayB[j]) {
//				mergerdArray[k] = arrayA[i];
//				k++;
//				i++;
//			}else {
//				mergerdArray[k] = arrayB[j];
//				k++;
//				j++;
//			}
			
			while( i < arrayA.length) {
				mergerdArray[k] = arrayA[i];
				k++;
				i++;
			}
			
			while( j < arrayB.length) {
				mergerdArray[k] = arrayB[j];
				k++;
				j++;
			}
		
		return mergerdArray;
	}

}
