package Arrays.Leedcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import ArraysPart1.FindDuplicate;

public class Duplicate {

	public static void main(String[] args) {
		int[] inputArray = new int[]{111, 333, 555, 777, 333, 444, 555};
		findDuplicate(inputArray);

	}
	
	public static void findDuplicate(int[] nums) {
		
		HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();
		
		for(int num : nums) {
			
			if(maps.containsKey(num)) {
				
				maps.put(num, maps.get(num)+1);
			}else {
				maps.put(num, 1);
			}
			
		}
		
		for(Map.Entry<Integer, Integer> entry : maps.entrySet()) {
			
			if(entry.getValue() >1) {
				
				System.out.println("The most repeated key is : "+ entry.getKey() );
				System.out.println("The most repeated value is : "+ entry.getValue() );
			}
		}
		
	}

}
