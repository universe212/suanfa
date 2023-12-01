package suanfa;

/**
 * ClassName: Solution322
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/16 20:02
 * @Version 1.0
 */
public class Solution322 {
    public int coinChange(int[] coins, int amount) {
        int max = Integer.MAX_VALUE;
        int[] dp = new int[amount + 1];
        for(int j = 0; j < dp.length;j++){
            dp[j] = max;
        }
     dp[0] = 0;
     for(int i = 0; i < coins.length; i++){//物品重量
         for(int j = coins[i]; j <= amount; j++){ //背包容量
             //求装最少得物品达到目标
             if(dp[j - coins[i]] != max){
                 dp[j] = Math.min(dp[j],dp[j-coins[i]] + 1);
             }
         }
     }
     return dp[amount] == max ? -1:dp[amount];
    }
}
