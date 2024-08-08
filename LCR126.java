package suanfa;

/**
 * ClassName: LCR126
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/3/18 19:17
 * @Version 1.0
 */
public class LCR126 {
    private static final int MOD = (int)1e9+7;
    public int fib(int n) {
            if(n  < 2){
                return n;
            }
            int[] dp = new int[n+1];
            dp[0] = 0;
            dp[1] = 1;
            for(int i = 2; i <= n; i++){
                dp[i] = (dp[i-1] + dp[i-2])%MOD;
            }
            return dp[n];
    }
}
