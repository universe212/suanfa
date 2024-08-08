package suanfa;

/**
 * ClassName: Solution121
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/20 16:52
 * @Version 1.0
 */
public class Solution121 {
    public int maxProfit(int[] prices) {
       int low = Integer.MAX_VALUE;
       int res = 0;
       for(int i = 0; i < prices.length; i++){
            low = Math.min(low,prices[i]);
            res = Math.max(prices[i] - low,res);
       }
return res;
    }


}
