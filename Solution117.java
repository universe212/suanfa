package suanfa;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ClassName: Solution117
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/26 15:52
 * @Version 1.0
 */
public class Solution117 {
    public Node connect(Node root) {
        if(root == null){
            return null;
        }
        Queue<Node> pq = new LinkedList<>();
        pq.add(root);
        int j = 0;
        while (!pq.isEmpty()) {
            int size = pq.size();

            for (int i = 0; i < size; i++) {
                Node node = pq.remove();
                if (i == size - 1) {
                    node.next = null;
                } else {
                    node.next = pq.peek();
                }

                if (node.left != null) {
                    pq.add(node.left);
                }
                if (node.right != null) {
                    pq.add(node.right);
                }

            }

        }
        return root;
    }
}
