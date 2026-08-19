/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class leetcode110 {

    public static int size(TreeNode rootleft) {
        if (rootleft == null) {
            return 0;
        }

        return 1 + Math.max(size(rootleft.left), size(rootleft.right));
    }


    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int left1 = size(root.left);
        int right = size(root.right);

        if(Math.abs(left1 - right) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);

    }
}
