import java.util.TreeSet;

class Solution {
    public int firstMissingPositive(int[] nums) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                set.add(nums[i]);

        }
        if (set.isEmpty() || set.first() > 1)
            return 1;
        else {
            int prev = set.first();
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
