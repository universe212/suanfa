package suanfa;

/**
 * ClassName: Solution343
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/30 19:42
 * @Version 1.0
 */
public class Solution343 {
    public int integerBreak(int n) {
      int[] dp = new int[n + 1];
      for(int i = 2; i <= n; i++){
          int max = 0;
          for(int j = 1; j < i; j++){
              max = Math.max(max,Math.max(i * (i - j),i * dp[i - j]));
          }
          dp[i] = max;
      }
     return dp[n];
    }
}
