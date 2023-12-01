package suanfa;

import java.util.ArrayList;

/**
 * ClassName: Solution501
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/28 19:56
 * @Version 1.0
 */
public class Solution501 {
      ArrayList<Integer> resList = new ArrayList<>();
      int count = 0;
      int Maxcount = 0;
      TreeNode pre;

    public int[] findMode(TreeNode root) {

        findMode1(root);
        int[] res = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            res[i] = resList.get(i);
        }
        return res;
    }

    private void findMode1(TreeNode root) {
        if (root == null) {
            return;
        }
        findMode1(root.left);
        if(pre == null || root.val != pre.val){
            count = 1;
        }
        else {
            count++;
        }
        if(count > Maxcount){
            resList.clear();
            resList.add(root.val);
            Maxcount = count;
        }
        else if(count == Maxcount){
            resList.add(root.val);
        }
        pre = root;
        findMode1(root.right);
    }

}
