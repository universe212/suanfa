package suanfa;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: Solution889
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/3/17 20:28
 * @Version 1.0
 */
public class Solution889 {
       public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
             int n = preorder.length;
           Map<Integer, Integer> postMap = new HashMap<Integer, Integer>();
           for (int i = 0; i < n; i++) {
               postMap.put(postorder[i], i);
           }
          return dfs(preorder,postorder,postMap,0,n-1,0,n-1);
  }

    private TreeNode dfs (int[] preorder, int[] postorder, Map<Integer, Integer> postMap, int preLeft, int preRight, int postLeft, int postRight) {
        if (preLeft > preRight || postLeft > postRight) {
            return null;
        }
        int leftCount = 0;
        if (preLeft < preRight) {
            leftCount = postMap.get(preorder[preLeft + 1]) - postLeft + 1;//可以找到左子树的个数
        }
       TreeNode root = new TreeNode(preorder[preLeft]);
       root.left =  dfs(preorder, postorder, postMap, preLeft + 1, preLeft + leftCount, postLeft, postLeft + leftCount - 1);
       root.right = dfs(preorder, postorder, postMap, preLeft + leftCount + 1, preRight, postLeft + leftCount, postRight - 1);
        return root;

       }

}
