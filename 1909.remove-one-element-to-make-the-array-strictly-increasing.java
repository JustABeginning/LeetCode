class Solution {
    public boolean canBeIncreasing(int[] nums) {
        boolean res = false;
        for (int i = 0; i < nums.length; i++) {
            if (checkIncr(nums, i)) {
                res = true;
                break;
            }
        }
        return res;
    }

    private boolean checkIncr(int[] arr, int k) {
        int n = arr.length - 1;
        for (int i = 0, j = i + 1; i < n; i = j, j++) {
            if (i == k)
                continue;
            if (j == k)
                j = k + 1;
            if (j <= n && arr[i] >= arr[j])
                return false;
        }
        return true;
    }
}
