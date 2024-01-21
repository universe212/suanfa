package suanfa;

/**
 * ClassName: Solution137
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/12 19:54
 * @Version 1.0
 */
public class Solution137 {
    public boolean articleMatch(String s, String p) {
        int m = s.length() + 1, n = p.length() + 1;
        boolean[][] dp = new boolean[m][n];
        dp[0][0] = true; //此时都为空，可以匹配
        for(int j = 2; j < n; j += 2)
            //确保在原文字符串为空字符串时，正则表达式 p 中的 * 可以正确地匹配。
            //初始化
            //正则表达式中的 * 前面必须有一个字符 X*X*X*  相当于找出true的情况 初始化
            dp[0][j] = dp[0][j - 2] && p.charAt(j - 1) == '*';
//由于 dp[0][0] 代表的是空字符的状态， 因此 dp[i][j] 对应的添加字符是 s[i - 1] 和 p[j - 1]
        //dp[j+1]=dp[m]对应 s[j]不存在
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                //p.charAt(j - 1) == '*' 意味着  p[i-2]*  *前面可有可无,所以看p[i-3]和s[i]的情况
                //dp[i-1][j] dp[i-1]表示第i-1个字符串,
                //为*的 三种情况 *可以让前面那个可有可无
                //a: dp[i]  dp[j-2]是否相等
                //b: dp[i-1] 和 dp[j] 在满足的情况下 还要 s第[i]个是不是和 p[j-1]个相等 相等就再加一个
                //c: dp[i-1] 和 dp[j] 在满足的情况下 看p[j-1]是不是.是点可以任意变一个字母是 b的升华
                dp[i][j] = p.charAt(j - 1) == '*' ?
                        dp[i][j - 2] || dp[i - 1][j] && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.') :
                        dp[i - 1][j - 1] && (p.charAt(j - 1) == '.' || s.charAt(i - 1) == p.charAt(j - 1));
            // a  dp[i-1]dp[j-1]相等 只是前i-1 j-1相等 还要最后一个字母相等
                //b  dp[i-1]dp[j-1]相等  p最后一个是. 可以随便变

            }
        }
        return dp[m - 1][n - 1];

    }
}
