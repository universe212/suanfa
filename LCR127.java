package suanfa;

/**
 * ClassName: LCR127
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/11 20:35
 * @Version 1.0
 */
public class LCR127 {
    public int trainWays(int num) {
        if (num <= 1)
            return 1;
        int[] dp = new int[num+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <=num; i++){
            dp[i] = dp[i-1] + dp[i-2];
            dp[i] %= 1000000007;
        }
        return dp[num];
    }
}
