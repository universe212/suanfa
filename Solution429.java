package suanfa;

import java.util.*;

/**
 * ClassName: Solution427
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/25 16:44
 * @Version 1.0
 */
public class Solution429 {
    public List<List<Integer>> levelOrder(Node root) {
       if(root == null){
           return  new ArrayList<List<Integer>>();
       }
        ArrayList<List<Integer>> result = new ArrayList<>();
        Queue<Node> pq = new LinkedList<>();
        pq.offer(root);
        while (!pq.isEmpty()){
            int size = pq.size();
            ArrayList<Integer> tt = new ArrayList<>();
            for(int i = 0; i < size; i++){
                Node remove = pq.remove();
                tt.add(remove.val);
                for (Node child : remove.children) {
                    pq.add(child);
                }

            }
            result.add(tt);
        }
        return result;


    }
}

