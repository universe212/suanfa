package suanfa;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ClassName: Solution513
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/2 19:35
 * @Version 1.0
 */
public class Solution513 {
    public int findBottomLeftValue(TreeNode root) {

        Queue<TreeNode> pq = new LinkedList<>();
        pq.add(root);
        int ans = 0;
        while (!pq.isEmpty()){
            int sz = pq.size();
            ans = pq.peek().val;
            while (sz-- > 0){
            TreeNode remove = pq.remove();
                if(remove.left != null){
                    pq.add(remove.left);
                }
            if(remove.right != null){
                pq.add(remove.right);
            }
        }}
        return ans;
    }
}
//class Solution {
//    int max, ans;
//    public int findBottomLeftValue(TreeNode root) {
//        dfs(root, 1);
//        return ans;
//    }
//    void dfs(TreeNode root, int depth) {
//        if (root == null) return ;
//        if (depth > max) {
//            max = depth; ans = root.val;
//        }
//        dfs(root.left, depth + 1);
//        dfs(root.right, depth + 1);
//    }
//}

