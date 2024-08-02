package Arrays.Leedcode;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] num = {2,7,11,15};
		int target =9;
	
		int[] arrow =twoSum(num, target);
		System.out.println(arrow);

	}
	
	
	 public static int[] twoSum(int[] nums, int target) {

	        HashMap<Integer, Integer> map = new HashMap();
	        
	       
	        for(int i=0; i<nums.length; i++) {
	           int complements = target - nums[i];
	           if(map.containsKey(complements)) {
	        	    return new int[]{map.get(complements), i};
	           }
	         map.put(nums[i], i);
	        }
	             
	        throw new IllegalArgumentException("No Solution");
	    }

}
