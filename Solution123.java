package suanfa;

/**
 * ClassName: Solution123
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/20 17:22
 * @Version 1.0
 */
public class Solution123 {
    public int maxProfit(int[] prices) {
      int l = prices.length;
      if(l == 0) return 0;
      int[][] dp = new int[l][5];
      dp[0][1] = -prices[0];
        dp[0][3] = -prices[0];
        for(int i = 1; i < l; i++){
            dp[i][1] = Math.max(dp[i - 1][1], - prices[i]); //1买
            dp[i][2] = Math.max(dp[i - 1][1] + prices[i],dp[i - 1][2]); //卖
            dp[i][3] = Math.max(dp[i - 1][2] - prices[i],dp[i - 1][3] );
            dp[i][4] = Math.max(dp[i - 1][3] + prices[i],dp[i - 1][4]);
        }
        return dp[l - 1][4];
    }
}
