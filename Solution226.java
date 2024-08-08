package suanfa;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ClassName: Solution226
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/26 16:42
 * @Version 1.0
 */
public class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        Queue<TreeNode> pq = new LinkedList<>();
        pq.add(root);
        while (!pq.isEmpty()) {
            int size = pq.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = pq.remove();
                if (node.right != null || node.left != null) {
                    if(node.right != null)pq.add(node.right);
                    if(node.left != null)pq.add(node.left);
                    TreeNode temp = node.right;
                    node.right = node.left;
                    node.left = temp;

                }

            }
        }
        return root;
    }
//    public TreeNode invertTree(TreeNode root) {
//        if (root == null) {
//            return null;
//        }
//        TreeNode left = invertTree(root.left);
//        TreeNode right = invertTree(root.right);
//        root.left = right;
//        root.right = left;
//        return root;
//    }
}

