package suanfa;

import java.util.Arrays;

/**
 * ClassName: Solution169
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/10 20:28
 * @Version 1.0
 */
public class Solution169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
