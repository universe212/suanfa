package suanfa;

/**
 * ClassName: Solution538
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/1 20:10
 * @Version 1.0
 */
public class Solution538 {
    int sum;
    public TreeNode convertBST(TreeNode root) {
        sum = 0;
        addTree(root);
        return root;
    }

    private void addTree(TreeNode root) {
        if(root == null){
            return ;
        }
        addTree(root.right);
        sum += root.val;
        root.val = sum;
        addTree(root.left);
    }

}
