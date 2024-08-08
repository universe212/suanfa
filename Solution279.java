package suanfa;

/**
 * ClassName: Solution279
 * Package: suanfa
 * Description
 * 2
 * @Author HuanZ
 * @Create 2023/11/16 20:50
 * @Version 1.0
 */
public class Solution279 {
    public int numSquares(int n) {
        int max = Integer.MAX_VALUE;
        int[] dp = new int[n + 1];
        for (int j = 0; j <= n; j++) {
            dp[j] = max;//初始化值都为最大值
        }
        dp[0] = 0;
       for(int i = 1; i * i <= n; i++){//物品重量
           for(int j = i*i; j <= n; j++){ //背包重量
               if(dp[j- i*i] ==max){
               dp[j] = Math.min(dp[j],dp[j - (i*i)] + 1);//加和不加
               //
           }
       }}
       return dp[n];
    }
}
