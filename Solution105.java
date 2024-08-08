package suanfa;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: Solution105
 * Package: suanfa
 * Description
 * 2
 * @Author HuanZ
 * @Create 2023/11/3 16:38
 * @Version 1.0
 */
public class Solution105 {
    int[] preorder;
    int[] inorder;
    int pre_inx;
    Map<Integer, Integer> idx_map = new HashMap<Integer, Integer>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.inorder = inorder;
        this.preorder = preorder;
        pre_inx = 0;
        int idx = 0;
        for (int i : inorder) {
            idx_map.put(i,idx++);
        }
        return helper(0,inorder.length - 1);


    }
    public TreeNode helper(int in_left, int in_right) {
        if(in_left > in_right || pre_inx > preorder.length -1){
            return null;
        }
        int root_val = preorder[pre_inx];//pre_inx是前序的坐标
        TreeNode root = new TreeNode(root_val);
        int index = idx_map.get(root_val);
        pre_inx++;

        root.left = helper(in_left,index - 1);
        root.right = helper(index + 1,in_right);
        return root;
    }


}
