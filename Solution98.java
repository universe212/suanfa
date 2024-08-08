package suanfa;

/**
 * ClassName: Solution98
 * Package: suanfa
 * Description
 *2
 * @Author HuanZ
 * @Create 2023/11/28 17:20
 * @Version 1.0
 */
public class Solution98 {
    private long prev = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }//到最底层条件
        if (!isValidBST(root.left)) {
            return false; //向左遍历
        }
        if (root.val <= prev) { // 不满足二叉搜索树条件
            return false; //判断值是不是满足小于他前面的 中序遍历
        }
        prev = root.val; //赋值
        return isValidBST(root.right);//向右遍历
    }
    }

