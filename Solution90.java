package suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName: Solution90
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/7 15:10
 * @Version 1.0
 */
public class Solution90 {
    List<List<Integer>>  result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        childSet(nums,0);
        return result;
    }
    private void childSet(int[] nums, int start) {
        result.add(new ArrayList<>(path));
        if(start >= nums.length){
            return;
        }
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i - 1]){
                continue;
            }
            path.add(nums[i]);
            childSet(nums,i + 1);
            path.removeLast();
        }
    }
}
