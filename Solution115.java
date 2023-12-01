package suanfa;

/**
 * ClassName: Solution115
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/23 19:21
 * @Version 1.0
 */
public class Solution115 {
    public int numDistinct(String s, String t) {
        int[][] dp = new int[t.length() + 1][s.length() + 1];
        for (int i = 0; i < s.length() + 1; i++) {
            dp[0][i] = 1;
        }
        //初始化存在问题
        for (int i = 1; i < t.length() + 1; i++) {
            for (int j = 1; j < s.length() + 1; j++) {
                if (t.charAt(i - 1) == s.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }

            }
        }

        return  dp[t.length() ][s.length()];
    }
}
