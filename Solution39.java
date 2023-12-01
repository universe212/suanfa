package suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: Solution39
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/3 21:13
 * @Version 1.0
 */
public class Solution39 {
//    List<List<Integer>> result = new ArrayList<>();
//    List<Integer> path = new ArrayList<>();
//    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//        dfs(candidates,target,0,0);
//        return result;
//    }
//
//    private void dfs(int[] candidates, int t,int sum,int j) {
//        if(sum == t){
//            result.add(path);
//            return;
//        }
//        else if(sum > t){
//            return;
//        }
//        for(int i = 0; i < candidates.length; i++){
//            while (sum < t){
//                path.add(candidates[i]);
//                sum += candidates[i];
//                if(sum > t){
//                    break;
//                }
//                else if(sum == t){
//                    result.add(path);
//                    path.clear();
//                }
//                }
//            sum -= candidates[i];
//            dfs(candidates,t,sum,j + 1);
//            path.remove(path.size() - 1);
//            }
//        }
public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(candidates); // 先进行排序
    backtracking(res, new ArrayList<>(), candidates, target, 0, 0);
    return res;
}

    public void backtracking(List<List<Integer>> res, List<Integer> path, int[] candidates, int target, int sum, int idx) {
        // 找到了数字和为 target 的组合
        if (sum == target) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = idx; i < candidates.length; i++) {
            // 如果 sum + candidates[i] > target 就终止遍历
            if (sum + candidates[i] > target) break;
            path.add(candidates[i]);
            backtracking(res, path, candidates, target, sum + candidates[i], i);
            path.remove(path.size() - 1); // 回溯，移除路径 path 最后一个元素
        }
    }


}
