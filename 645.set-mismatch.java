import java.util.HashSet;

class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup = 0, miss = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++)
            if (set.contains(nums[i]))
                dup = nums[i];
            else
                set.add(nums[i]);
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                miss = i;
                break;
            }
        }
        int[] res = new int[2];
        res[0] = dup;
        res[1] = miss;
        return res;
    }
}
