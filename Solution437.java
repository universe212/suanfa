package suanfa;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: Solution437
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/29 19:49
 * @Version 1.0
 */
public class Solution437 {

    Map<Long, Integer> map = new HashMap<>();
    int ans, t;
    public int pathSum(TreeNode root, int _t) {
        if (root == null) return 0;
        t = _t;
        map.put(0L, 1);
        dfs(root, root.val);
        return ans;
    }
    void dfs(TreeNode root, long val) {
        if (map.containsKey(val - t)) ans += map.get(val - t);
        map.put(val, map.getOrDefault(val, 0) + 1);
        if (root.left != null) dfs(root.left, val + root.left.val);
        if (root.right != null) dfs(root.right, val + root.right.val);
        map.put(val, map.getOrDefault(val, 0) - 1);
    }

//    int ans, t;
//    public int pathSum(TreeNode root, int _t) {
//       t = _t;
//       dfs(root);
//       return ans;
//    }
//    //对于每个当前节点
//    private void dfs(TreeNode root) {
//        if(root == null){
//            return;
//        }
//        dfs2(root.val,root);
//        dfs(root.left);
//        dfs(root.right);
//    }
//    //搜索以其为根的所有（往下的）路径，同时累加路径总和
//    private void dfs2(long val, TreeNode root) {
//        if(root == null){
//            return ;
//        }
//        if(val == t){
//            ans++;
//        }
//        if(root.left != null)dfs2(val + root.left.val,root.left);
//        if(root.right != null)dfs2(val + root.right.val,root.right);
//    }


}
