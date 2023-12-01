package suanfa;

/**
 * ClassName: Solution98
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/28 17:20
 * @Version 1.0
 */
public class Solution98 {
    private long prev = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isValidBST(root.left)) {
            return false;
        }
        if (root.val <= prev) { // 不满足二叉搜索树条件
            return false;
        }
        prev = root.val;
        return isValidBST(root.right);
    }
    }

