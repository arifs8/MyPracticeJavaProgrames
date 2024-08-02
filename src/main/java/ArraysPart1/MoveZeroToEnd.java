package ArraysPart1;

import java.util.Arrays;

public class MoveZeroToEnd {

	public static void main(String[] args) {

		// Declare and initialize the array elements
		int arr[] = {1,0, 3, 9, 5, 1, 0, 0, 11, 6, 0, 9 };

		// getting length of an array
		int n = arr.length;

		// calling user defined method
		func(arr, n);
	}

	// user defined method
	static void func(int arr[], int n) {
		// Count of non-zero elements
		int count = 0;

		// shifting non zero element to the left of the loop
		for (int i = 0; i < n; i++)
			if (arr[i] != 0)
				arr[count++] = arr[i];
	

		// adding the zeros to the end
		while (count < n)
			arr[count++] = 0;
	

		// printing the result
		System.out.println("Elements of array after moving all the zeros to the end of array: ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}
