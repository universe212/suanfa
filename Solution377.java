package suanfa;

/**
 * ClassName: Solution377
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/15 20:44
 * @Version 1.0
 */
public class Solution377 {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 0; i <= target; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i >= nums[j]) {
                    dp[i] += dp[i - nums[j]];
                }
            }
        }
        return dp[target];
    }
}
