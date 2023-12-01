package suanfa;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ClassName: Solution222
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/2 16:55
 * @Version 1.0
 */
public class Solution222 {
    public int countNodes(TreeNode root) {
     if(root == null){
         return 0;
     }
        Queue<TreeNode> pq = new LinkedList<>();
     pq.add(root);
     int j = 0;
     while (!pq.isEmpty()){
         int size = pq.size();
         for(int i = 0; i < size; i++){
             TreeNode remove = pq.remove();
             j++;
             if(remove.left != null){
                 pq.add(remove.left);
             }
             if(remove.right != null){
                 pq.add(remove.right);
             }
         }
     }
     return j;
    }
}
