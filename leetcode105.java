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
class leetcode105 {
    //全局书签，遍历preorder先序数组
    private int index;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        index = 0;   //每一组测试样例，书签重置为0
        return buildTreeHelper(preorder, inorder, 0, inorder.length);
    }

    /**
     * start、end：在inorder中 [start , end) 左闭右开区间，构建这一段对应的子树
     * preorder：先序数组，拿根节点靠全局index
     */
    private TreeNode buildTreeHelper(int[] preorder, int[] inorder, int start, int end) {
        //递归终止条件1：区间为空，没有元素，返回null
        if(start >= end){
            return null;
        }
        //递归终止条件2：先序数组全部用完了，没有节点可以创建
        if(index >= preorder.length){
            return null;
        }

        //先序的index位置就是当前子树的根节点
        TreeNode root = new TreeNode(preorder[index]);
        index++;   //❗重点：创建完节点，立刻把书签往后移动一次，只写这一处index++

        //在中序数组[start,end)里面，找到根节点值所在下标pos
        int pos = findPos(inorder, start, end, root.val);

        //中序数组：[start , pos) 全部属于左子树；[pos+1 , end)全部属于右子树
        root.left = buildTreeHelper(preorder, inorder, start, pos);
        root.right = buildTreeHelper(preorder, inorder, pos + 1, end);

        return root;
    }

    //在inorder[start, end)区间查找target，返回下标pos
    private int findPos(int[] inorder, int start, int end, int target){
        for(int i = start; i < end; i++){
            if(inorder[i] == target){
                return i;
            }
        }
        return -1;
    }
}