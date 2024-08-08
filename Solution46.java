package suanfa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName: Solution46
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/7 16:09
 * @Version 1.0
 */
public class Solution46 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0) return result;
        backTracking(nums);
        return result;
    }
    private void backTracking(int[] nums){
        if(path.size() == nums.length){
            result.add(new ArrayList<>(path));
            }
        for(int i = 0; i < nums.length; i++){
            if(path.contains(nums[i])) continue;
            path.add(nums[i]);
            backTracking(nums);
            path.remove(path.size() - 1);
        }
    }
}
