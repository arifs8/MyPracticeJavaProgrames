package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeDupliactes {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>(Arrays.asList(1, 2, 1));
		System.out.println(removedup(num));

	}

	public static List<Integer> removedup(List<Integer> nums) {

		int n = nums.size();
		int i = 0;

		List<Integer> ans = new ArrayList<Integer>();
		while (i < n) {
			int x = nums.get(i);
			while (i < n && x == nums.get(i)) {
				i++;
			}
			ans.add(x);
		}
		return ans;
	}

}
