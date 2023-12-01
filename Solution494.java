package suanfa;

/**
 * ClassName: Solution494
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/15 16:07
 * @Version 1.0
 */
public class Solution494 {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }//neg 为负数的和 sum - neg 为正数的
        int diff = sum - target;
        if(diff < 0 || diff % 2 != 0){
            return 0;
        }
        int n = nums.length, neg = diff / 2;//看上面表达式 实际上是能找到相加等于负数和就是答案了
//        int[][] dp = new int[n + 1][neg + 1];
//        dp[0][0] = 1;
//        for(int i = 1; i <= n;i++){
//            int num = nums[i - 1];
//            for (int j = 0; j <= neg;j++){
//                dp[i][j] = dp[i - 1][j];
//                if(num <= j){
//                    dp[i][j] += dp[i-1][j-num];
//                }
//            }
//        }
//        return dp[n][neg];
        int[] dp = new int[neg];
        dp[0] = 1;
        for (int num : nums) {
            for(int j = neg; j>= num;j--){
                dp[j] += dp[j-num];

            }

        }
        return dp[neg];
    }
}
