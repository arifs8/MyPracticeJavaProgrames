package Arrays;

import java.nio.Buffer;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 1, 2, 2, 3 };
		int k = 2;
		
		System.out.println(topKFrequent(nums, k));

	}

	public static int[] topKFrequent(int[] nums, int k) {
		
		List<Integer>[] bucket = new List[nums.length + 1];
		
		Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
		
		for(int n :nums) {
			
			frequencyMap.put(n, frequencyMap.getOrDefault(n, 0)+1);
		}
		
		for(int key : frequencyMap.keySet()) {
			
			int frequency = frequencyMap.get(key);
			if(bucket[frequency] == null) {
				bucket[frequency] = new ArrayList<Integer>();
			}
			
			bucket[frequency].add(key);
		}
		
		
		int[] result = new int[k];
		int counter =0;
		
		for(int pos= bucket.length-1; pos>= 0 && counter<k ; pos--) {
			if(bucket[pos]!=null) {
				for(Integer integer : bucket[pos]) {
					result[counter++] = integer;
				}
			}
		}
		
		return result;

	}

}
