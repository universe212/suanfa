package suanfa;

/**
 * ClassName: Solution309
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/21 19:26
 * @Version 1.0
 */
public class Solution309 {
    public int maxProfit(int[] prices) {
        int l = prices.length;
        if(l == 0) return 0;
        int[][] dp = new int[l][4];
        dp[0][0] = -prices[0];
        //0持股/买入
        //1保持卖出
        //2卖出股
        //3冷冻期
        for(int i = 1; i < l;i++){
            //保持昨天持股  昨天冷冻今天买入  昨天保持卖出 今天买入
         dp[i][0] = Math.max(dp[i-1][0],Math.max(dp[i-1][3] - prices[i],dp[i-1][1] - prices[i]));
            //昨天是冷冻   昨天也是保持
            dp[i][1] = Math.max(dp[i - 1][3],dp[i-1][1]);
            //昨天持股 今天卖出
         dp[i][2] = dp[i-1][0]  + prices[i];
            //冷冻期 昨天卖出
          dp[i][3] = dp[i-1][2];
        }
      return Math.max(dp[l-1][3],Math.max(dp[l-1][2],dp[l-1][1]));
    }
}
