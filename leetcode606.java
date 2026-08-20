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
class leetcode606 {
    public String tree2str(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        dfs(root, sb);
        return sb.toString();
    }

    private void dfs(TreeNode root, StringBuilder sb){
        if(root == null){
            return;
        }
        //前序：先输出根的值
        sb.append(root.val);

        //左子树不为null，必须写 ( 递归左 )
        if(root.left != null){
            sb.append("(");
            dfs(root.left, sb);
            sb.append(")");
        }
        //重点！！ 左是空，但是右不是空，左边必须补一对空括号 ()
        else if(root.right != null){
            sb.append("()");
        }

        //处理右子树：右不为空才写括号，右为空直接什么都不做
        if(root.right != null){
            sb.append("(");
            dfs(root.right, sb);
            sb.append(")");
        }
    }
}