package suanfa;

/**
 * ClassName: Solution122
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/9 17:03
 * @Version 1.0
 */
public class Solution122 {
    public int maxProfit(int[] prices) {
        int l = prices.length;
          int[] dp = new int[l];
          dp[0] = prices[0];
          int max = 0;
        for(int i = 1; i < l; i++){
            int q = prices[i] - prices[i - 1];
            if(q > 0){
                max += q;
            }
        }
        if(max == 0){
            return 0;
        }
        return max;
    }
}
