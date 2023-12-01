package suanfa;

/**
 * ClassName: Solution714
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/21 20:18
 * @Version 1.0
 */
public class Solution714 {
    public int maxProfit(int[] prices, int fee) {
        int l = prices.length;
        int[][] dp = new int[l][2];
        dp[0][0] = -prices[0];
        //0是买/持有  1不持有卖
        for(int i = 1; i < l; i++){
          dp[i][0] = Math.max(dp[i-1][1] - prices[i] ,dp[i-1][0]);
          dp[i][1] = Math.max(dp[i-1][0] + prices[i] -fee,dp[i-1][1]);
    }
        return Math.max(dp[l-1][0],dp[l-1][1]);
}}
