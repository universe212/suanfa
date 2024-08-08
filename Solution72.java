package suanfa;

/**
 * ClassName: Solution72
 * Package: suanfa
 * Description
 * 2
 * @Author HuanZ
 * @Create 2023/11/23 20:36
 * @Version 1.0
 */
public class Solution72 {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m + 1][n + 1];
        // 初始化
        for (int i = 1; i <= m; i++) {
            dp[i][0] =  i;//表示i个字符变成 空需要多少操作
        }
        for (int j = 1; j <= n; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // 因为dp数组有效位从1开始
                // 所以当前遍历到的字符串的位置为i-1 | j-1
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];//dp[i][j] 表示以下标i-1为结尾的字符串word1，和以下标j-1为结尾的字符串word2，最近编辑距离为dp[i][j]。
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i][j - 1]), dp[i - 1][j]) + 1;
                    //dp[i-1][j-1]表示替换保持之前的在之前上面+1个操作
                    //其余就是 删除 word1 和删除word2
                }
            }
        }
        return dp[m][n];


        //首先我们先关注一下dp[i][j]的定义，表示的是word1 中0-i 转化成word2的 0-j 所需的最小的操作次数。
        //
        //接着我们来看 dp[i-1][j] ，它表示word1的 0， i-1 已经转成 word2的0-j的最小操作数了，但是我们需要讨论的是 第 i 和第 j位的操作数，由于i-1 已经和 j 匹配上了，因此只需删除掉第 i位即可。
        //
        //然后是 dp[i][j-1]， 也同理，i已经和 j-1位匹配上了，但是此时 j 位就多出来了，由于是word1 向word2 转化，因此只需要在 i 位后面插入一个就OK了。
        //
        //至于dp[i-1][j-1]位置，如果两个位置的字符不相等，那么就需要进行替换操作。
    }
}
