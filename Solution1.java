package suanfa;

import java.util.HashMap;

/**
 * ClassName: Solution1
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/19 19:40
 * @Version 1.0
 */
public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
                if(result.containsKey(target - nums[i])){
                    return new int[]{result.get(target - nums[i]),i};
                }
            result.put(nums[i],i);//放到后面是为了 当放入的数字和里面又数字相等的情况返回出问题 eg(3,0,3) target=6

        }

        return new int[0];
    }}
