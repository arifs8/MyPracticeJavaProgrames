package ArraysPart1;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates1 {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 6, 7};
		
		int[] i = remveDuplicates(array);
		System.out.println(Arrays.toString(i));

	}
	
	public static int[] remveDuplicates(int[] arr) {
		
		HashSet<Integer> has = new HashSet<Integer>();
		
		for(int num : arr) {
			
			has.add(num);
		}
		
		int[] unique = new int[has.size()];
		int index =0;
		for(int num : has) {
			unique[index++] = num;
		}
		
		return unique;
		
		
	}

}
