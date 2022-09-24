import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

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
    private LinkedList<Integer> list;
    private List<List<Integer>> ans;

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        list = new LinkedList<Integer>();
        ans = new ArrayList<List<Integer>>();
        preorder(root, 0, targetSum);
        return ans;
    }

    private void preorder(TreeNode root, int sum, int target) {
        if (root != null) {
            sum += root.val;
            list.add(root.val);
            if (root.left == null && root.right == null) {
                if (sum == target) {
                    List<Integer> tmp = new ArrayList<Integer>();
                    tmp.addAll(list);
                    ans.add(tmp);
                }
                list.removeLast();
                return;
            }
            preorder(root.left, sum, target);
            preorder(root.right, sum, target);
            list.removeLast();
        }
    }
}
