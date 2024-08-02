package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {12, 7, 11, 15, 2};
        int target = 9;

        int[] ans = twoSum(nums, target);
        if (ans != null) {
            System.out.println("Indices: " + Arrays.toString(ans));
            System.out.println("Values: " + nums[ans[0]] + " " + nums[ans[1]]);
        } else {
            System.out.println("No two sum solution found.");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return null; // No solution found
    }
}
