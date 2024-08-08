package suanfa;

/**
 * ClassName: Solution1143
 * Package: suanfa
 * Description
 * 2
 * @Author HuanZ
 * @Create 2023/11/22 19:15
 * @Version 1.0
 */
public class Solution1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        //提问为什么不可以从0开始因为会不满足公式
        //公式 就是毕竟第i 和 第j 个字母是否相同
        //如果相同就是dp[i-1][j-1] + 1
        //不相同 dp[i][j] = dp[i-1][j] 和 dp[i][j-1]最大值
        //所以可以得到  i j 从 1 开始
        //因为是比较的 [i-1][j-1] 所以dp要取到 text1.length()
        int[][] dp = new int[text1.length() + 1][text2.length() + 1]; // 先对dp数组做初始化操作
        for (int i = 1 ; i <= text1.length() ; i++) {
            char char1 = text1.charAt(i - 1);
            for (int j = 1; j <= text2.length(); j++) {
                char char2 = text2.charAt(j - 1);
                if (char1 == char2) { // 开始列出状态转移方程
                    dp[i][j] = dp[i - 1][j - 1] + 1;  //a   aaaa
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);//dp[i-1][j]表示不包含text
                    //abc 和 ace 第三个不同但是最长公共子序列可能是 dp[abc][ac]
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
}
