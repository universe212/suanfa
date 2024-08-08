package suanfa;

/**
 * ClassName: Solution104
 * Package: suanfa
 * Description
 * 2
 * @Author HuanZ
 * @Create 2023/10/26 15:53
 * @Version 1.0
 */
public class Solution104 {


    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }


}

