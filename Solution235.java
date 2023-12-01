package suanfa;

/**
 * ClassName: Solution235
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/30 19:11
 * @Version 1.0
 */
public class Solution235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       while (true){
           if(root.val > p.val && root.val > q.val){
               root = root.left;
           }
           else if(root.val < p.val && root.val < q.val){
               root = root.right;
           }
           else {
               break;
           }
       }
       return root;
    }
}
