package suanfa;

/**
 * ClassName: Solution530
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/28 19:30
 * @Version 1.0
 */
public class Solution530 {
    int pre = -1;
    int result = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
      dfs(root);
      return result;
    }

    private void dfs(TreeNode root) {
        if(root == null){
            return ;
        }
        dfs(root.left);
        if(pre != -1 ){
         result = Math.min(result,root.val - pre);}
        pre = root.val;
        dfs(root.right);

    }
}
