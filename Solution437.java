package suanfa;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: Solution437
 * Package: suanfa
 * Description
 * 2
 * @Author HuanZ
 * @Create 2023/12/29 19:49
 * @Version 1.0
 */
public class Solution437 {

    Map<Long, Integer> map = new HashMap<>();//存储前缀和
    //理解前缀和  1 2  把1放进去 然后把 12 放进去  目标值是2的话  和3-2刚好等于1 也可以推出来
    //这就是前缀和的妙处
    int ans, t;
    public int pathSum(TreeNode root, int _t) {
        if (root == null) return 0;
        t = _t;//目标值  ans就是次数
        map.put(0L, 1);//传入0进去 传入0的意思是如果第一个数字满足
        dfs(root, root.val);//根节点先进去
        return ans;
    }
    void dfs(TreeNode root, long val) {
        if(map.containsKey(val - t)) ans += map.get(val-t); // val - t包含值不 从 root开始遍历  思路逆天

        //这里面存储了 map存储了记住肯定先把左边存进去
        map.put(val,map.getOrDefault(val,0) + 1);
        //每次加的也是前缀和
        if (root.left != null) dfs(root.left,val+root.left.val);
        //从左
        if (root.right != null) dfs(root.right, val + root.right.val);
        //从右
        map.put(val,map.getOrDefault(val,0)-1);
       //移除得是val前缀和 不是root.val 移出的是从本到当前root
    }

//    int ans, t;
//    public int pathSum(TreeNode root, int _t) {
//       t = _t;
//       dfs(root);
//       return ans;
//    }
//    //对于每个当前节点
//    private void dfs(TreeNode root) {
//        if(root == null){
//            return;
//        }
//        dfs2(root.val,root);
//        dfs(root.left);
//        dfs(root.right);
//    }
//    //搜索以其为根的所有（往下的）路径，同时累加路径总和
//    private void dfs2(long val, TreeNode root) {
//        if(root == null){
//            return ;
//        }
//        if(val == t){
//            ans++;
//        }
//        if(root.left != null)dfs2(val + root.left.val,root.left);
//        if(root.right != null)dfs2(val + root.right.val,root.right);
//    }


}
