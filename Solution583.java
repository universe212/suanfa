package suanfa;

/**
 * ClassName: Solution583
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/23 19:05
 * @Version 1.0
 */
public class Solution583 {
    public int minDistance(String word1, String word2) {
        int numbers = 0;
        int max = 0;
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 1; i < word1.length() + 1; i++) {
            for (int j = 1; j < word2.length() + 1; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
               max = Math.max(dp[i][j],max);
            }
        }
        int i1 = word1.length() - dp[word1.length()][word2.length()];
        int i2 = word2.length() - dp[word1.length()][word2.length()];
        return  i1+i2;
    }
}
