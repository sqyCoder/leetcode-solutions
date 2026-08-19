import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//二叉树节点定义
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class leetcode102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // res：最终结果，外层List存每一层，内层List存本层所有节点值
        List<List<Integer>> res = new ArrayList<>();
        //边界：树为空，直接返回空集合，不能返回null
        if (root == null) {
            return res;
        }

        //队列，存放TreeNode节点对象，LinkedList实现Queue接口
        Queue<TreeNode> queue = new LinkedList<>();
        //根节点入队列，存节点对象，不是存节点的val数值
        queue.offer(root);

        //!queue.isEmpty()：队列不为空就继续循环，队列对象本身不会变成null
        while (!queue.isEmpty()) {
            //获取当前这一层一共有多少节点，这一步是层序分组的核心
            int levelSize = queue.size();
            //新建一个list，保存当前这一层的所有数值
            List<Integer> levelList = new ArrayList<>();

            //循环levelSize次，把当前层所有节点处理完
            for(int i = 0; i < levelSize; i++){
                //队头节点出队
                TreeNode cur = queue.poll();
                //把当前节点的值加入本层list
                levelList.add(cur.val);

                //左孩子不为空，左孩子入队列，留给下一层处理
                if(cur.left != null){
                    queue.offer(cur.left);
                }
                //右孩子不为空，右孩子入队列，留给下一层处理
                if(cur.right != null){
                    queue.offer(cur.right);
                }
            }
            //当前层处理完毕，把这一层的list加入总结果res
            res.add(levelList);
        }
        //全部层遍历完成，返回结果
        return res;
    }

    //main方法，程序入口，测试用
    public static void main(String[] args) {
        //手动构造测试树 [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        leetcode102 solution = new leetcode102();
        List<List<Integer>> ans = solution.levelOrder(root);
        System.out.println(ans);
    }
}