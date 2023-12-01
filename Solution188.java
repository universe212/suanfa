package suanfa;

/**
 * ClassName: Solution188
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/21 16:42
 * @Version 1.0
 */
public class Solution188 {
    public int maxProfit(int k, int[] prices) {
        int l = prices.length;
        if(l == 0) return 0;
        int[][][] dp = new int[l][k + 1][2];
        for(int i = 0; i <= k; i++){
            dp[0][i][1] = -prices[0];
        }
        for(int i = 1; i < l; i++) {
           for(int j = 1; j <=k; j++){
            //控制第几天
            //j控制第j次买入卖出的操作
            //0卖出     1买入/持有
           dp[i][j][0] = Math.max(dp[i - 1][j][1] + prices[i], dp[i - 1][j][0]);
            //左边表示今天第j卖出 昨天是第j持有  右边是没有操作沿用昨天
               dp[i][j][1] = Math.max(dp[i - 1][j - 1][0] - prices[i], dp[i - 1][j][1]);
            //左边表示今天第j买出 昨天是第j - 1次持有  右边是昨天就是第j次买了 昨天就是

        } }
        return dp[l - 1][k][0];
    }
}
