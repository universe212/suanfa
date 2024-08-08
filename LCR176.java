package suanfa;

/**
 * ClassName: LCR176
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/23 19:10
 * @Version 1.0
 */
public class LCR176 {
    public boolean isBalanced(TreeNode root) {
         if(root == null) return true;
         return Math.abs((dfs(root.left) - dfs(root.right))) <= 1 && isBalanced(root.left) && isBalanced(root.right);
   //isBalanced判断的是当前 以root为根的是不是 二叉平衡树
        //return dfs 就是判断   后面的is是判断他的孩子是不是

    }

    private int dfs(TreeNode root) {
      if(root == null){
          return 0;
      }
      int r = dfs(root.right);
      int l = dfs(root.left);
      return Math.max(l,r) +1;

    }

}
