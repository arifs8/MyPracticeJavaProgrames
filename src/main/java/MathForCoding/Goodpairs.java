package MathForCoding;

import java.util.EnumSet;

public class Goodpairs {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1,1,3};
		System.out.println(goodpair(nums));

	}
	
	public static int goodpair(int[] nums){
		
		int n = nums.length;
		int countPairs =0;
		
		for(int i=0 ;i<n;i++) {
			for(int j=i+1; j<n;j++) {
				
				if(nums[i] == nums[j]) {
					countPairs++;
				}
			}
		}
		return countPairs;
	}

}
