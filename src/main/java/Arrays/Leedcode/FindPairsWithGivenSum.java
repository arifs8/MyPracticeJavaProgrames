package Arrays.Leedcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindPairsWithGivenSum {

	public static void main(String[] args) {
		int[] inputArray = new int[] { 1, 5, 7, -1, 5 };
		int targetSum = 6;

		findPairsWithGivenSum(inputArray, targetSum);
	}

	public static void findPairsWithGivenSum(int[] array, int target) {
		HashSet<Integer> set = new HashSet<>();
		System.out.println("pair of " + target +" is :" );
		
		for(int num :array) {
			
			int expectedNum = target - num;
			
			if(set.contains(expectedNum)) {
				System.out.print("(" + expectedNum +"," + num + ")");
			}else {
				set.add(num);
			}
		}
	}

}
