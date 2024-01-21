package suanfa;

/**
 * ClassName: LCR155
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/16 21:27
 * @Version 1.0
 */
public class LCR155 {
    Node pre,head;
    public Node treeToDoublyList(Node root) {
//二叉搜索树的中序遍历为 递增序列 。
        if(root == null)return null;
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    private void dfs(Node root) {
        if(root == null) return;
        dfs(root.left); //找到最底部最小值
        if(pre != null) pre.right = root; //比如root为2 他的pre不是空就是
        else head = root;//这个是 第一次循环到底部 把head赋值给root
        root.left = pre;//前驱先给一个空值
        pre = root;//pre移动
        dfs(root.right);
    }
}
