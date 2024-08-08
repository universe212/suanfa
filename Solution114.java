package suanfa;

import java.util.ArrayList;

/**
 * ClassName: Solution114
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/29 19:15
 * @Version 1.0
 */
public class Solution114 {
    public void flatten(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        dfs(root,res);
        for (int i = 1; i < res.size(); i++) {
            TreeNode pre = new TreeNode(res.get(i - 1));
            TreeNode pre1 = new TreeNode(res.get(i));
            pre.right = pre1;
            pre.left = null;

        }

    }

    private void dfs(TreeNode root, ArrayList<Integer> res) {

        if(root == null){
            return;
        }
        res.add(root.val);
        dfs(root.left,res);
        dfs(root.right,res);
    }
 }
