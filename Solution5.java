package suanfa;

/**
 * ClassName: Solution5
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/10 19:36
 * @Version 1.0
 */
public class Solution5 {
    public String longestPalindrome(String s) {
      //分析 babcde要满足最长 dp[i][j]表示 i到j是不是为回文 满足条件  s[i] == s[j] && s[i+1][j-1]
        int length = s.length();
        boolean[][] dp = new boolean[length][length];
        for(int i = 0; i < length; i++){
            dp[i][i] = true;
        }
        if(length < 2){
            return s;
        }
        int maxLen = 1;
        int begin = 0;
        char[] chars = s.toCharArray();
        for(int j = 1; j < length; j++){
            for(int i = 0; i < j; i++){
               if(chars[i] != chars[j]){
                   dp[i][j] = false;
               }
               else {
                   if(j - i < 3){
                       //说明之间只有一个字符串 肯定是回文
                       dp[i][j] = true;
                   }
                   else {
                       dp[i][j] = dp[i+1][j-1];
                   }
               }
               //如果dp[i][j]为真就判断长度是不是最大
               if(dp[i][j] && j - i + 1 > maxLen){
                   maxLen = j - i + 1;
                   begin = i;
               }

            }
        }
        return s.substring(begin,begin+maxLen);
    }
}
