package suanfa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName: Solution78
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/6 20:35
 * @Version 1.0
 */
public class Solution78 {
    List<List<Integer>>  result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
        childSet(nums,0);
        return result;
    }

    private void childSet(int[] nums, int start) {
        result.add(new ArrayList<>(path));
        if(start >= nums.length){
            return;
        }
        for(int i = start; i < nums.length; i++){
            path.add(nums[i]);
            childSet(nums,i + 1);
            path.removeLast();

        }
    }
}
