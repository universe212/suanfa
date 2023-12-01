package suanfa;

import java.util.Stack;

/**
 * ClassName: Solution617
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/28 16:18
 * @Version 1.0
 */
public class Solution617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null) return root2;
        if(root2 == null) return root1;
//        root1.val += root2.val;
//        root1.left = mergeTrees(root1.left,root2.left);
//        root1.right = mergeTrees(root1.right,root2.right);
//        return root1;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root1);
        stack.push(root2);
        while (!stack.isEmpty()) {
            TreeNode node2 = stack.pop();
            TreeNode node1 = stack.pop();
            node1.val += node2.val;

            if(node1.right != null && node2.right != null){

                stack.push(node1.right);
                stack.push(node2.right);
            }
            else {
                if(node1.right == null){
                    node1.right = node2.right;
                }
            }
            if(node1.left != null && node2.left != null){

                stack.push(node1.left);
                stack.push(node2.left);

            }
            else {
                if(node1.left == null){
                    node1.left = node2.left;
                }
            }

        }
        return root1;
    }
}
