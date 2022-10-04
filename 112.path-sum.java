/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    private boolean ans;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        ans = false;
        preorder(root, 0, targetSum);
        return ans;
    }

    private void preorder(TreeNode ptr, int sum, int target) {
        if (ptr != null) {
            sum += ptr.val;
            if (ptr.left == null && ptr.right == null) {
                if (sum == target)
                    ans = true;
                return;
            }
            preorder(ptr.left, sum, target);
            preorder(ptr.right, sum, target);
        }
    }
}
