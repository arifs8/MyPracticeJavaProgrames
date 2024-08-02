package ArraysPart1;

import java.util.ArrayList;
import java.util.Vector;

public class RemoveDuplicates {

	public static void main(String[] args) {


		int[] nums = {1,1,2,3,4,4};
	System.out.println(solution(nums));
		
		

	}
	
	public static ArrayList<Integer> solution(int[] nums) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
			//	Vector<Integer> vd = new Vector<Integer>();
				int n = nums.length;
				al.add(nums[0]);
				for(int i=1; i<n ;i++) {
					
					if(nums[i] == nums[i-1]) {
						
						continue;
					}else {
						al.add(nums[i]);
					}
				}
				
				return al;
	}

}
