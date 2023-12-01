package suanfa;

/**
 * ClassName: Solution669
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/30 20:52
 * @Version 1.0
 */
public class Solution669 {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) return null;
        if(root.val < low){
            return trimBST(root.right,low,high);
        }
        if(root.val > high){
            return trimBST(root.left,low,high);
        }
        root.left = trimBST(root.left,low,high);
        root.right = trimBST(root.right,low,high);
        return root;
    }
}
