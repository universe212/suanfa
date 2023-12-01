package suanfa;

/**
 * ClassName: Solution968
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/14 20:47
 * @Version 1.0
 */
public class Solution968 {
    int res = 0;

    public int minCameraCover(TreeNode root) {
        if (minCame(root) == 0) {
            res++;
        }
        return res;

    }

    public int minCame(TreeNode root) {
        if (root == null) {
            return 2;
        }
        int left = minCame(root.left);
        int right = minCame(root.right);

        if (left == 2 && right == 2) {
            return 0;
        } else if (left == 0 || right == 0) {
            res++;
            return 1;
        } else  {
            return 2;
        }

    }
}
