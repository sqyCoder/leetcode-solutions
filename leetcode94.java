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
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class leetcode94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;

        while(cur != null || !stack.isEmpty()){
            //1.一直往左走，整条左链全部压入栈
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            //左边走到头了，弹出栈顶
            cur = stack.pop();
            res.add(cur.val); //访问根

            //转到右子树，下一轮循环继续对右子树做“一直往左压”
            cur = cur.right;
        }
        return res;
    }
}