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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth > 1)
            preorder(root, depth, val);
        else {
            TreeNode ptr = new TreeNode(val);
            ptr.left = root;
            root = ptr;
        }
        return root;
    }

    private void preorder(TreeNode ptr, int depth, int val) {
        if (ptr != null) {
            depth--;
            if (depth == 1) {
                TreeNode leftN = new TreeNode(val);
                TreeNode rightN = new TreeNode(val);
                leftN.left = ptr.left;
                rightN.right = ptr.right;
                ptr.left = leftN;
                ptr.right = rightN;
            } else {
                preorder(ptr.left, depth, val);
                preorder(ptr.right, depth, val);
            }
        }
    }
}
