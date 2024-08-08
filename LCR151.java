package suanfa;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * ClassName: LCR151
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/16 20:11
 * @Version 1.0
 */
public class LCR151 {
    public List<List<Integer>> decorateRecord(TreeNode root) {
        Queue<TreeNode> pq = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();
        if(root != null) pq.add(root);
        while (!pq.isEmpty()){
            LinkedList<Integer> temp = new LinkedList<>();
            for(int i = 0; i < pq.size();i++){
                TreeNode node = pq.poll();
                if(result.size() %2 == 0){
                    temp.addLast(node.val);//result = 2,现在应该是第三层不反转
                }
                else temp.addFirst(node.val);
                if(node.left != null) pq.add(node.left);
                if(node.right != null) pq.add(node.right);
         }
            result.add(temp);
        }
        return result;
    }
}
