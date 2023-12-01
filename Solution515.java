package suanfa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * ClassName: Solution515
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/25 16:56
 * @Version 1.0
 */
public class Solution515 {
    public List<Integer> largestValues(TreeNode root) {
        if(root == null){
            return new ArrayList<Integer>();
        }
        Queue<TreeNode> pq = new LinkedList<>();
        List<Integer> tt = new ArrayList<>();
        pq.add(root);
        int j = 0;
        while (!pq.isEmpty()) {
            int size = pq.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode node = pq.remove();
                max = Math.max(max,node.val);
                if (node.right != null) {
                    pq.add(node.right);
                }
                if (node.left != null) {
                    pq.add(node.left);
                }
            }
            tt.add(max);
        }
        return tt;
    }
}
