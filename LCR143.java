package suanfa;

/**
 * ClassName: LCR143
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/15 21:04
 * @Version 1.0
 */
public class LCR143 {
    //大体思路是遍历A的每一个点 再以这个点为根的基础上和B做比较
    public boolean isSubStructure(TreeNode A, TreeNode B) {
     if(A == null || B == null){
          return false;// 当 树 A 为空 或 树 B 为空 时，直接返回 false 这个B是完整的B 所以 任意一个 为B直接false
     }
     if(recur(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right,B)){ //当匹配到和B的值相等
         return true;
     }
     return false;
    }
//先序遍历树 A 中的每个节点 node
//判断树 A 中以 node 为根节点的子树是否包含树 B 。
    private boolean recur(TreeNode a, TreeNode b) {
        if(b == null){
            return true;
        }
        //当节点 A 为空：说明已经越过树 A 的叶节点，即匹配失败，返回 false
        //当节点 A 和 B 的值不同：说明匹配失败，返回 false
        if(a == null || a.val != b.val) return false;
        //A和B相等 继续匹配
        return recur(a.left,b.left) && recur(a.right,b.right);

    }

}
