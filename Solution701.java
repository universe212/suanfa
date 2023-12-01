package suanfa;

/**
 * ClassName: Solution701
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/30 19:32
 * @Version 1.0
 */
public class Solution701 {
    TreeNode pre;
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        TreeNode pre = root;
        TreeNode newRoot = root;
        while (true){
            if(root.val > val){
                if(root.left == null){
                    root.left = new TreeNode(val);
                }
                root = root.left;
            }
            else if(root.val < val){
                if(root.right== null){
                    root.right = new TreeNode(val);
                }
                root = root.right;
            }
            else {break;}
        }
        return newRoot;
      }
    }

