package ArraysPart1;

import java.util.Arrays;

public class MergeTwoUnsortedArrays {

	public static void main(String[] args) {

		int[] arrayA = { 12, -7, 18, 9, 37, -1, 21 };

		int[] arrayB = { 27, 8, 71, -9, 18 };
		
		int[] mergeArrrr = mergessssArray(arrayA, arrayB);
		System.out.println(Arrays.toString(mergeArrrr));

	}

	public static int[] mergessssArray(int[] arr1, int[] arr2) {

		int[] mergedArray = new int[arr1.length + arr2.length];

		int i = 0, j = 0, k = 0;

		while (i < arr1.length) {

			mergedArray[k] = arr1[i];
			k++;
			i++;
		}

		while (j < arr2.length) {

			mergedArray[k] = arr1[j];
			k++;
			j++;
		}
		
		Arrays.sort(mergedArray);
		return mergedArray;
	}

}
