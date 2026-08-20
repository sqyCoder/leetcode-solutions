/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class leetcode236 {
    //成员变量，用来保存找到的最近公共祖先
    private TreeNode lc = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //每次调用方法，先把答案置null，防止上一组测试数据残留
        lc = null;
        //调用布尔型的递归辅助函数，去遍历整棵树
        lowestCommonAncestorHelper(root, p, q);
        //递归跑完之后 lca里面就存好了答案，直接返回
        return lc;
    }

    /**
     * helper返回boolean：
     * true ：当前root这棵子树中，存在p 或者 q（至少有一个）
     * false：当前root这棵子树中，p、q两个都不存在
     */
    private boolean lowestCommonAncestorHelper(TreeNode root, TreeNode p, TreeNode q) {
        //递归终止条件：空树，肯定没有p、q，返回false
        if(root == null){
            return false;
        }

        //left：左子树有没有p/q，有就是1，没有就是0
        int left = lowestCommonAncestorHelper(root.left, p, q) ? 1 : 0;
        //right：右子树有没有p/q，有就是1，没有就是0
        int right = lowestCommonAncestorHelper(root.right, p, q) ? 1 : 0;
        //mid：当前自己这个节点，是不是p，或者是不是q。是就1，不是0
        int mid = (root == p || root == q) ? 1 : 0;

        //重点判断！ left + right + mid == 2
        //三块里面加起来等于2，说明p和q两个全部出现在这棵子树内
        //而且现在这个root，就是它们的汇合点，就是最近公共祖先
        if(left + right + mid == 2){
            lc = root;
        }

        //向上层反馈消息：只要左、右、自己任意一处找到p/q，就返回true
        return (left ==1) || (right ==1) || (mid ==1);
    }
}