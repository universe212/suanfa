package suanfa;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ClassName: Solution104
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/26 15:53
 * @Version 1.0
 */
public class Solution104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> pq = new LinkedList<>();
        pq.add(root);
        int max = 1;
        boolean f = false;
        while (!pq.isEmpty()) {
            int size = pq.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = pq.remove();
                if (node.left != null) {
                    pq.add(node.left);
                    System.out.println(node.left.val);
                }
                if (node.right != null) {
                    pq.add(node.right);
                    System.out.println(node.right.val);
                }

            }
            max++;

        }

        return max;
    }

}

