package suanfa;

import java.util.HashMap;

/**
 * ClassName: LCR124
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/3/17 19:24
 * @Version 1.0
 */
public class LCR124 {
    int[] preorder;
    int[] inorder;
    int length;
    HashMap<Integer,Integer> result =  new HashMap<>();
    public TreeNode deduceTree(int[] preorder, int[] inorder) {
     this.preorder = preorder;
     this.inorder = inorder;
     length = 0;
     for(int i = 0; i < inorder.length; i++){
         result.put(inorder[i],i);
     }
     return dfs(0,inorder.length-1);

    }

    TreeNode dfs(int left, int right) {
        if(left > right){
            return null;
        }
        int i = result.get(preorder[length]);//获取对应中序角标
        TreeNode root = new TreeNode(preorder[length]);
        length++;
        dfs(left,i-1);

        dfs(i+1,right);
        return root;

    }
}
