package suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName: Solution47
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/7 16:41
 * @Version 1.0
 */
public class Solution47 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    boolean[] used;
    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums.length == 0) return result;
        used = new boolean[nums.length];
        Arrays.fill(used, false);
        backTracking(nums);
        return result;
    }

    private void backTracking(int[] nums) {
        if(path.size() == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++){
            if(used[i] || nums[i] == nums[i - 1]) continue;
            used[i] = true;
            path.add(nums[i]);
            backTracking(nums);
            used[i] = false;
            path.removeLast();
        }
    }
}
