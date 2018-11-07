package leetcode.answer.done;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) return null;

        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0;i < nums.length; i++) {
            int tmp = nums[i];
            int x = target - tmp;
            Integer xi = m.get(x);
            if (xi != null) {
                return new int[]{xi, i};
            }
            else {
                m.put(tmp, i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        int target = 7;
        TwoSum solution = new TwoSum();
        System.out.println(solution.twoSum(arr, target)[1]);
    }
}
