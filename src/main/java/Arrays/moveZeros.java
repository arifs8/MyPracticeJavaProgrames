package Arrays;

import java.util.Arrays;

public class moveZeros {

	public static void main(String[] args) {
		int nums[] = { 0, 1, 0, 3, 12 };

		int[] result = removeZeros(nums);

		// Print the resulting array
		System.out.println(Arrays.toString(result));
	}

	public static int[] removeZeros(int[] nums) {
		// Count the number of non-zero elements
		int count = 0;
		for (int num : nums) {
			if (num != 0) {
				count++;
			}
		}

		// Create a new array to store the non-zero elements
		int[] result = new int[count];
		int index = 0;

		// Copy the non-zero elements to the new array
		for (int num : nums) {
			if (num != 0) {
				result[index++] = num;
			}
		}

		return result;
	}
}
