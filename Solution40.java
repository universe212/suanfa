package suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: Solution40
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/3 21:42
 * @Version 1.0
 */
public class Solution40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates); // 先进行排序
        backtracking(res, new ArrayList<>(), candidates, target, 0, 0);
        return res;}
    public void backtracking(List<List<Integer>> res, List<Integer> path, int[] candidates, int target, int sum, int idx) {
        // 找到了数字和为 target 的组合
        if (sum == target) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = idx; i < candidates.length; i++) {
            // 如果 sum + candidates[i] > target 就终止遍历
            if (sum + candidates[i] > target) break;
            if(i > idx && candidates[i] == candidates[i - 1] ){
                continue;
            }
            path.add(candidates[i]);
            backtracking(res, path, candidates, target, sum + candidates[i], i + 1);
            path.remove(path.size() - 1); // 回溯，移除路径 path 最后一个元素
        }
    }
}
