package suanfa;

/**
 * ClassName: Solution230
 * Package: suanfa
 * Description
 * 2
 * @Author HuanZ
 * @Create 2023/12/29 19:05
 * @Version 1.0
 */
public class Solution230 {
    int ans = 0;
    int i = 0;
    public int kthSmallest(TreeNode root, int k) {
        dfs(root,k);
        return ans;
    }

    private void dfs(TreeNode root, int k) {
        if(root == null){
            return;
        }
        dfs(root.left,k);
        i  = i + 1;
        if(i == k){
           ans = root.val;
           return;
        }
        dfs(root.right,k);
    }
}
