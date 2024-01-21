package suanfa;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ClassName: LRC156
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/19 19:10
 * @Version 1.0
 */
public class LRC156 {
    // Encodes a tree to a single string.
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

    // Decodes your encoded data to tree.
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
