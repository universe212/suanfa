package suanfa;

import java.util.*;

/**
 * ClassName: Solution637
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/25 16:19
 * @Version 1.0
 */
public class Solution637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> cnts = new ArrayList<>();
        Queue<TreeNode> pq = new LinkedList<>();
        pq.add(root);
        int j = 0;
        while (!pq.isEmpty()) {
            ArrayList<Integer> tt = new ArrayList<>();
            int size = pq.size();
            double sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = pq.remove();
                sum += node.val;
                tt.add(node.val);
                if (node.right != null) {
                    pq.add(node.right);
                }
                if (node.left != null) {
                    pq.add(node.left);
                }
            }
            double result = (double) sum / size;
            cnts.add(result);

        }
        return cnts;
    }

}
