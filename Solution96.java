package suanfa;

/**
 * ClassName: Solution96
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/30 20:21
 * @Version 1.0
 */
public class Solution96 {
    public int numTrees(int n) {
         int[] dp = new int[n - 1];
         dp[0] = 1;
         dp[1] =1;//正常情况从 2开始,
        //G(n)=G(0)∗G(n−1)+G(1)∗(n−2)+...+G(n−1)∗G(0)
        for(int i = 2; i <= n; i++){//i相当于控制n算几个得
            for(int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }}
        return dp[n];

    }
}
