package suanfa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * ClassName: Solution107
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/24 21:06
 * @Version 1.0
 */
public class Solution107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        listd(lists,root,0);
        return lists;

    }

    private void listd(List<List<Integer>> lists, TreeNode root, int depth) {
        if(root == null){
            return;
        }
        if(lists.size() == depth ){
            lists.add(0,new ArrayList<>()); //在列表的开头添加一个新的空列表，用于存储下一层的节点值。
        }
        lists.get(lists.size() - depth - 1).add(root.val);
        listd(lists,root.left,depth + 1);
        listd(lists,root.right,depth + 1);
    }

    public List<List<Integer>> levelOrderB(TreeNode root){
        List<List<Integer>> levelOrder = new LinkedList<List<Integer>>();
        if (root == null) {
            return levelOrder;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<Integer>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                TreeNode left = node.left, right = node.right;
                if (left != null) {
                    queue.offer(left);
                }
                if (right != null) {
                    queue.offer(right);
                }
            }
            levelOrder.add(0, level);
        }
        return levelOrder;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        Solution107 solution107 = new Solution107();
        List<List<Integer>> lists = solution107.levelOrderBottom(root);
        System.out.println(lists);
    }


}
