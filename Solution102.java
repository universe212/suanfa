package suanfa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName: Solution102
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/24 20:30
 * @Version 1.0
 */
public class Solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
       if(root == null) {
           return  new ArrayList<List<Integer>>();
       }
        ArrayList<List<Integer>> lists = new ArrayList<>();
        LinkedList<TreeNode> pq = new LinkedList<>();
        pq.add(root);
        while (pq.size() > 0){
            int size = pq.size();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode remove = pq.remove();
                list.add(remove.val);
                if(remove.left != null){
                    pq.add(remove.left);
                }
                if(remove.right != null){
                    pq.add(remove.right);
                }

            }
            lists.add(list);
        }
return lists;
    }
}
