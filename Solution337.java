package suanfa;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: Solution337
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/17 20:14
 * @Version 1.0
 */
public class Solution337 {
    public int rob(TreeNode root) {
        Map<TreeNode, Integer> memo = new HashMap<>();
        return robAction(root, memo);
    }

    int robAction(TreeNode root, Map<TreeNode, Integer> memo) {
        if (root == null) {
            return 0;
        }
        if (memo.containsKey(root)) {
            return memo.get(root);  //减少不必要的遍历
        }
        int money = root.val;
        int left = 0, right = 0;
        if (root.left != null) {
            left = robAction(root.left.right, memo) + robAction(root.left.left, memo);

        }
        if (root.right != null) {
            right = robAction(root.right.right, memo) + robAction(root.right.left, memo);
        }
        int max = Math.max(left + right + money, robAction(root.left, memo) + robAction(root.right, memo));

        memo.put(root, max);
        return max;

    }

}
