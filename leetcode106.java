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
class leetcode106{
    private int index;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        index = postorder.length - 1;
        return buildTreeHelper(inorder, postorder, 0, inorder.length);
    }

    public TreeNode buildTreeHelper(int[] inorder, int[] postorder, int start, int end) {
        if (start >= end) {
            return null;
        }

        if (index < 0) {
            return null;
        }

        TreeNode root = new TreeNode(postorder[index]);
        index--;

        int pos = findPos(inorder, start, end, root.val);

        root.right = buildTreeHelper(inorder, postorder, pos + 1, end);

        root.left = buildTreeHelper(inorder, postorder, start, pos);
        return root;
    }

    private int findPos(int[] inorder, int start, int end, int target) {
        for (int i = start; i < end; i++) {
            if (inorder[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
