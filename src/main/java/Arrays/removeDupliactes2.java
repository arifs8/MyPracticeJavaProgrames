package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class removeDupliactes2 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1,2,4,7,8,4,9};
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i : nums) {
			set.add(i);
		}
		
		//System.out.print(set);
		
		int[] uniqueArray = new int[set.size()];
		
		int index=0;
		
		for(int value : set) {
			
			uniqueArray[index++] = value;
		}
		
		System.out.println(Arrays.toString(uniqueArray));

	}

}
