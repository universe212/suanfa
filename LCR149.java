package suanfa;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * ClassName: LCR149
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/16 19:49
 * @Version 1.0
 */
public class LCR149 {
    public int[] decorateRecord(TreeNode root) {
        if(root == null) return new int[0];
        Queue<TreeNode> objects = new LinkedList<>();
        objects.add(root);
        List<Integer> result = new LinkedList<>();
        while (!objects.isEmpty()){
            int size = objects.size();
            while (size > 0){
                TreeNode poll = objects.poll();
                result.add(poll.val);

                if( poll.left != null){
                    objects.add(poll.left);
                }
                if( poll.right != null){
                    objects.add(poll.right);
                }
                size--;
            }
        }
        // 转换为 int 数组
        int[] res = new int[result.size()];
        for(int i = 0; i < result.size(); i++)
            res[i] = result.get(i);

        return res;
    }
}
