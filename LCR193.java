package suanfa;

/**
 * ClassName: LCR193
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/6/18 22:24
 * @Version 1.0
 */
public class LCR193 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ancestor = root;
        while (true) {
            if (p.val < ancestor.val && q.val < ancestor.val) {
                ancestor = ancestor.left;
            } else if (p.val > ancestor.val && q.val > ancestor.val) {
                ancestor = ancestor.right;
            } else {
                break;
            }
        }
        return ancestor;
    }

}
