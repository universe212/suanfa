package suanfa;

import java.util.Arrays;

/**
 * ClassName: Solution1005
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/9 20:45
 * @Version 1.0
 */
public class Solution1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                nums[i] = -nums[i];
                k--;
            }
            sum += nums[i];
        }
        Arrays.sort(nums);

        return sum - ((k%2 == 0 ? 0 : 2*nums[0]));
    }
}
