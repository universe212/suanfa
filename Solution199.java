package suanfa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * ClassName: Solution199
 * Package: suanfa
 * Description
 * 2
 * @Author HuanZ
 * @Create 2023/10/25 15:40
 * @Version 1.0
 */
public class Solution199 {
    //广度优先BFS
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> cnts = new ArrayList<>();
        Queue<TreeNode> pq = new LinkedList<>();
        pq.add(root);
        while (!pq.isEmpty()) {
            int size = pq.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = pq.remove();

                if (node.left != null) {
                    pq.add(node.left);
                }
                if (node.right != null) {
                    pq.add(node.right);
                }
                if (size - i == 1) {
                    cnts.add(node.val);
                }
            }

        }
        return cnts;
    }

    //深度优先DFS
    public List<Integer> rightSideView1(TreeNode root) {

        dfs(root, 0); // 从根节点开始访问，根节点深度是0
        return res;
    }

    List<Integer> res = new ArrayList<>();

    private void dfs(TreeNode root, int depth) {
       if(root == null){
           return;
       }
       if(res.size() == depth){
           res.add(root.val);
       }
       dfs(root.right,depth + 1);
       dfs(root.left,depth + 1);
    }
}
