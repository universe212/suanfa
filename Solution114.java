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


        ArrayList<TreeNode> result = new ArrayList<>();
        dfs(result,root);
        for(int i = 1; i < result.size();i++){
            TreeNode pre = result.get(i-1);
            TreeNode pr = result.get(i);
            pre.left = null;
            pre.right = pr;
        }
    }

    private void dfs(ArrayList<TreeNode> result, TreeNode root) {
        if(root == null){
            return;
        }
        result.add(root);
        dfs(result,root.left);
        dfs(result,root.right);



}}
