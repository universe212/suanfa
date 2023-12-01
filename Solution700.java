package suanfa;

import java.util.Stack;

/**
 * ClassName: Solution700
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/28 17:04
 * @Version 1.0
 */
public class Solution700 {
    public TreeNode searchBST(TreeNode root, int val) {
     if (root == null) return null;
        Stack<TreeNode> pq = new Stack<>();
        pq.push(root);
        while (!pq.isEmpty()){
            TreeNode node = pq.pop();
            if(node.val == val){
               return node;
            }
            if(node.left != null){
                pq.push(node.left);
            }
            if(node.right != null){
                pq.push(node.right);
            }
        }
        return null;

//        if (root == null || root.val == val) {
//            return root;
//        }
//        if (val < root.val) {
//            return searchBST(root.left, val);
//        } else {
//            return searchBST(root.right, val);
//        }
    }
}
