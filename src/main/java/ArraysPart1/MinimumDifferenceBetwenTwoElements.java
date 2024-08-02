package ArraysPart1;

import java.util.Arrays;

public class MinimumDifferenceBetwenTwoElements {

	public static void main(String[] args) {
		int[] arr = { 5, 8, 4, 2, 9, 0 };

		Arrays.sort(arr);

		int diff = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i + 1] - arr[i] < diff) {

				diff = arr[i + 1] - arr[i];

			}

		}

		System.out.println(diff);

	}

}
