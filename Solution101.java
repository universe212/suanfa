package suanfa;

import java.util.LinkedList;

/**
 * ClassName: Solution101
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/26 20:13
 * @Version 1.0
 */
public class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null || (root.right == null && root.left == null)){
            return true;
        }
        LinkedList<TreeNode> pq = new LinkedList<>();
        pq.add(root.left);
        pq.add(root.right);
        while (pq.size() > 0){
            TreeNode left = pq.removeFirst();
            TreeNode right = pq.removeFirst();
            if(left == null && right == null){
                continue;
            }
            if(left.val != right.val){
                return false;
            }
            if(left == null || right == null){
                return false;
            }
            pq.add(left.left);
            pq.add(right.right);
            pq.add(left.right);
            pq.add(right.left);
        }
        return true;

    }
    public boolean isSymmetric1(TreeNode root) {
        if(root==null) {
            return true;
        }
        //调用递归函数，比较左节点，右节点
        return dfs(root.left,root.right);
    }

    boolean dfs(TreeNode left, TreeNode right) {
        //递归的终止条件是两个节点都为空
        //或者两个节点中有一个为空
        //或者两个节点的值不相等
        if(left==null && right==null) {
            return true;
        }
        if(left==null || right==null) {
            return false;
        }
        if(left.val!=right.val) {
            return false;
        }
        //再递归的比较 左节点的左孩子 和 右节点的右孩子
        //以及比较  左节点的右孩子 和 右节点的左孩子
        return dfs(left.left,right.right) && dfs(left.right,right.left);
    }


}
