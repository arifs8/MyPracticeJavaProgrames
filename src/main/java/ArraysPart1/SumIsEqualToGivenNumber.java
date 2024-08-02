package ArraysPart1;

import java.util.Arrays;

public class SumIsEqualToGivenNumber {

	public static void main(String[] args) {
		int[] arr = { 12, 23, 10, 41, 15, 38, 27 };
		int target = 50;

		sunIsEqualToGivenNumber(arr, target);

	}

	public static void sunIsEqualToGivenNumber(int[] arr, int num) {

		Arrays.sort(arr);

		  System.out.println("Pairs of elements whose sum is "+num+" are : ");

		int i = 0;
		int j = arr.length - 1;

		while (i < j) {

			if (arr[i] + arr[j] == num) {

				System.out.println("The numbers are : " + arr[i] + " And " + arr[j]);
				i++;
				j--;
			} else if (arr[i] + arr[j] < num) {

				i++;
			} else if (arr[i] + arr[j] > num) {

				j--;
			}

		}
	}

}
