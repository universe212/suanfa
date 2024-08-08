package suanfa;

import java.util.Arrays;

/**
 * ClassName: Solution300
 * Package: suanfa
 * Description
 * 2
 * @Author HuanZ
 * @Create 2023/11/21 20:48
 * @Version 1.0
 */
public class Solution300 {
    public int lengthOfLIS(int[] nums) {
        if (nums.length <= 1) return nums.length;
       int l = nums.length;
       int[] dp = new int[l];
       Arrays.fill(dp,1);
       int res =0;
       for(int i = 1; i < l; i++){ //表示数组前几位
           for(int j = 0; j < i; j++){
               if(nums[i] > nums[j]){
                   dp[i] = Math.max(dp[j] + 1,dp[i]);
               }
               res = Math.max(res,dp[i]);
           }

       }
       return res;
    }
}
