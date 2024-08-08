package suanfa;

/**
 * ClassName: Solution70
 * Package: suanfa
 * Description
 *1
 * @Author HuanZ
 * @Create 2024/3/10 10:05
 * @Version 1.0
 */
public class Solution70 {
    public int climbStairs(int n) {
//        int[] dp = new int[n+1];
//        dp[0] = 1;
//        dp[1] = 1;
//        for(int i = 2; i <= n; i++){
//            dp[i] = dp[i-1] + dp[i-2];
//        }
//        return dp[n];
        if(n == 1)return 1;
        if(n == 2) return  2;
        return climbStairs(n-1) + climbStairs(n-2);
    }
    }
