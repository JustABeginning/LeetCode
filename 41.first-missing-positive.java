import java.util.TreeSet;

class Solution {
    public int firstMissingPositive(int[] nums) {
        int min = 0;
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                if (min == 0 || nums[i] < min)
                    min = nums[i];
                set.add(nums[i]);
            }
        }
        if (min > 1)
            return 1;
        else {
            int prev = min;
            for (int x : set) {
                if ((x - prev) > 1)
                    break;
                prev = x;
            }
            prev++;
            return prev;
        }
    }
}
