package RahulShettyProgrammes;

public class MaxDiffBtwAdjacentArray {

	public static void main(String[] args) {
		int[] arr = {1,4,8,15,17};

		int diff = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i + 1] - arr[i] > diff) {

				diff = arr[i + 1] - arr[i];
			}
			System.out.println(diff);


		}

	
	}

}
