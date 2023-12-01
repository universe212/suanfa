package suanfa;

/**
 * ClassName: TreeNode
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/24 20:29
 * @Version 1.0
 */
public class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(TreeNode left, TreeNode right, int val) {
        this.left = left;
        this.right = right;
        this.val = val;
    }
}
