package suanfa;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ClassName: LCR156
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/3/23 19:31
 * @Version 1.0
 */
public class LCR156 {
    //序列化  把树变成[1,2]
    public String serialize(TreeNode root) {
        if(root == null)return "[]";
        StringBuilder res = new StringBuilder("[");
        Queue<TreeNode> pq = new LinkedList<>();
        pq.add(root);
        while (!pq.isEmpty()){
            TreeNode poll = pq.poll();
            if(poll != null){
                res.append(poll.val + ",");
                pq.add(poll.left);
                pq.add(poll.right);
            }
            else {
                res.append("null,");
            }
        }
        res.deleteCharAt(res.length() - 1);
        res.append("]");
        return res.toString();
    }

    // Decodes your encoded data to tree.  是把[1,2]变成树
    public TreeNode deserialize(String data) {
        if(data.equals("[]")) return null;
        String[] split = data.substring(1, data.length() - 1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(split[0]));
        Queue<TreeNode> pq = new LinkedList<>();
        pq.add(root);
        int i = 1;
        while (!pq.isEmpty()){
            TreeNode poll = pq.poll();
            if(!split[i].equals("null")){
                poll.left = new TreeNode(Integer.parseInt(split[i]));
                pq.add(poll.left);
            }
            i++;
            if(!split[i].equals("null")){
                poll.right = new TreeNode(Integer.parseInt(split[i]));
                pq.add(poll.right);
            }
            i++;

        }
        return root;
    }
}
