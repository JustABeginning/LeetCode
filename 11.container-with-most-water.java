class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int ans = 0, left_max = 0, right_max = 0;
        while (left < right) {
            ans = Math.max(ans, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                if (height[left] > left_max)
                    left_max = height[left];
                left++;
            } else {
                if (height[right] > right_max)
                    right_max = height[right];
                right--;
            }
        }
        return ans;
    }
}
