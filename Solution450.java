package suanfa;

/**
 * ClassName: Solution450
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/30 20:13
 * @Version 1.0
 */
public class Solution450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return root;
        if (root.val == key) {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                TreeNode cur = root.right;
                while (cur.left != null) { //存在 找出来了 将 cur变成 root.right的Left标记好连接 root left
                    cur = cur.left;  //几种情况
                }
                cur.left = root.left;//是把root左孩子放到root左孩子下面
                root = root.right;
                return root;
            }
        }
        if (root.val > key) root.left = deleteNode(root.left, key);
        if (root.val < key) root.right = deleteNode(root.right, key);
        return root;
    }
}
