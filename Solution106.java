package suanfa;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: Solution106
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/2 20:18
 * @Version 1.0
 */
public class Solution106 {
    int post_inx;
    int[] postorder;
    int[] inorder;
    Map<Integer, Integer> idx_map = new HashMap<Integer, Integer>();
    public TreeNode helper(int in_left, int in_right) {
        if(in_left > in_right){
            return null;
        }
        int root_val = postorder[post_inx];
        TreeNode root = new TreeNode(root_val);
        int index = idx_map.get(root_val);
        post_inx--;
        root.right = helper(index + 1,in_right);
        root.left = helper(in_left,index - 1);
        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.inorder = inorder;
        this.postorder = postorder;
        post_inx = postorder.length - 1;
        int idx = 0;
        for (int i : inorder) {
            idx_map.put(i,idx++);
        }
        return helper(0,inorder.length - 1);


    }
}
