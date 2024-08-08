package suanfa;

/**
 * ClassName: Solution53
 * Package: suanfa
 * Description
 *2
 * @Author HuanZ
 * @Create 2023/11/9 16:18
 * @Version 1.0
 */
public class Solution53 {
    public int maxSubArray(int[] nums) {


        int ans = Integer.MIN_VALUE;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        ans = nums[0];
        for(int i = 1; i < nums.length; i++){
             dp[i] = Math.max(dp[i-1] + nums[i], nums[i] );
             ans = Math.max(ans,dp[i]); //和前面合并 不合并
        }
return ans;

    }
}
