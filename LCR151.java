package suanfa;

import java.util.ArrayList;
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
        if (root == null){
            return new ArrayList<>();
        }
        Queue<TreeNode> objects = new LinkedList<>();
        objects.add(root);
        List<List<Integer>> lists = new LinkedList<>();

        int i = 0;
        while (!objects.isEmpty()){
            int size = objects.size();
            LinkedList<Integer> cnt = new LinkedList<>();
            LinkedList<Integer> cnt2 = new LinkedList<>();
            while (size > 0){
                TreeNode poll = objects.poll();
                cnt.add(poll.val);
                if( poll.left != null){
                    objects.add(poll.left);
                }
                if( poll.right != null){
                    objects.add(poll.right);
                }
                size--;
            }
            i++;
            if(i % 2 == 0){
                for(int j = cnt.size() - 1; j > -1; j--){
                    cnt2.add(cnt.get(j));
                }
                lists.add(cnt2);
            }
            else {
                lists.add(cnt);
            }
        }


        return lists;
    }
}
