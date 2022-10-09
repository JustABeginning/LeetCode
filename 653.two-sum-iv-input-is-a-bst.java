import java.util.ArrayList;
import java.util.List;

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
    private List<Integer> arr;

    public boolean findTarget(TreeNode root, int k) {
        arr = new ArrayList<Integer>();
        inorder(root);
        int left = 0, right = arr.size() - 1;
        while (left < right) {
            int s = arr.get(left) + arr.get(right);
            if (s == k)
                return true;
            else if (s < k)
                left++;
            else
                right--;
        }
        return false;
    }

    private void inorder(TreeNode ptr) {
        if (ptr != null) {
            if (ptr.left != null)
                inorder(ptr.left);
            arr.add(ptr.val);
            if (ptr.right != null)
                inorder(ptr.right);
        }
    }
}
