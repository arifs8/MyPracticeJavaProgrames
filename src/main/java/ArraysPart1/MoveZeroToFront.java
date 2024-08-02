package ArraysPart1;

import java.util.Arrays;

public class MoveZeroToFront {

	public static void main(String[] args) {

		int[] arr = { 12, 0, 7, 0, 8, 0, 3 };

		frontZeros(arr);

	}

	public static void frontZeros(int[] arr) {

		int count = arr.length - 1;

		for (int i = arr.length - 1; i >= 0; i--) {

			if (arr[i] != 0) {

				arr[count] = arr[i];
				count--;
			}
		}

		while (count >= 0) {

			arr[count] = 0;
			count--;
		}

		System.out.println(Arrays.toString(arr));
	}

}
