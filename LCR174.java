package suanfa;

import java.util.ArrayList;

/**
 * ClassName: LCR174
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/22 20:45
 * @Version 1.0
 */
public class LCR174 {
    public int findTargetNode(TreeNode root, int cnt) {
        ArrayList<Integer> result = new ArrayList<>();
        dfs(root,result);
        int[] ints = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            ints[i] = result.get(i);
        }
        return ints[result.size() - cnt];
    }

    private void dfs(TreeNode root, ArrayList<Integer> result) {
        if(root == null){
            return;
        }
        dfs(root.left, result);
        result.add(root.val);
        dfs(root.right,result);
    }
}
