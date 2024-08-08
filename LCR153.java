package suanfa;

import java.util.LinkedList;
import java.util.List;

/**
 * ClassName: LCR153
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/16 20:56
 * @Version 1.0
 */
public class LCR153 {

    List<List<Integer>> lists;
    public List<List<Integer>> pathTarget(TreeNode root, int target) {
        lists = new LinkedList<>();

        List<Integer> path = new LinkedList<>();
        dfs(root,target,path);
        return lists;
    }

    private void dfs(TreeNode root, int target, List<Integer> path) {
       if(root == null){return;} //如果是空直接返回

        path.add(root.val);//把先值加进去

       target -= root.val;//减去这个值

       if(target == 0 && root.left == null && root.right == null){
           lists.add(new LinkedList(path)); //如果是叶子节点 并且满足 就 加入进去
       }
        dfs(root.left,target,path);//遍历

        dfs(root.right,target,path);
        path.remove(path.size() - 1);//删除把刚刚加的删除
    }
}
