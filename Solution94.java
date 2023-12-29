package suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Solution94
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/28 20:49
 * @Version 1.0
 */
public class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root,res);
        return res;

    }

    private void dfs(TreeNode root,List<Integer> res) {
        if(root == null){
            return;
        }
        dfs(root.left,res);
        res.add(root.val);
        dfs(root.right,res);
    }
}
