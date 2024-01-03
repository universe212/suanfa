package suanfa;

/**
 * ClassName: Solution124
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/29 19:46
 * @Version 1.0
 */
public class Solution124 {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
      dfs(root);
      return max;
    }

    private int dfs(TreeNode root) {

        if(root == null){
            return 0;
        }
        int left = Math.max(dfs(root.left),0); //有点像到最底下慢慢回溯
        int right = Math.max(dfs(root.right),0);
        max = Math.max(max,left + right + root.val);//比较不加根 和加根得值谁大

        return root.val + Math.max(left,right); //返回上一个节点 因为要直线所以只能二选一

    }


}
