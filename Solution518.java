package suanfa;

/**
 * ClassName: Solution518
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/15 20:14
 * @Version 1.0
 */
public class Solution518 {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for(int i = 0; i < coins.length; i++){
            for(int j = coins[i];  j<= amount; j++){
                dp[j] += dp[j - coins[i]] ;
            }
        }
        return dp[amount];
    }
}
