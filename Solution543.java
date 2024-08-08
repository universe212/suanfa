package suanfa;

/**
 * ClassName: Solution543
 * Package: suanfa
 * Description
 * 2
 * @Author HuanZ
 * @Create 2023/12/28 21:23
 * @Version 1.0
 */
public class Solution543 {
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans = 0;
        dfs(root);
        return ans ;

    }

    private int dfs(TreeNode root) {
        if(root == null){
            return 0;
        }
        int L = dfs(root.left); //深入到左边最下面
        int R = dfs(root.right); //深入到右边最下面
        ans = Math.max(ans,L+R);//节点数等于 左深度+有深度+1 每次筛选最大路径
        return Math.max(L,R) + 1; //返回一个最大值
    }}



