package suanfa;

/**
 * ClassName: Solution5
 * Package: suanfa
 * Description
 * 2
 * @Author HuanZ
 * @Create 2024/1/10 19:36
 * @Version 1.0
 */
public class Solution5 {
    public String longestPalindrome(String s) {
      //分析 babcde要满足最长 dp[i][j]表示 i到j是不是为回文 满足条件  s[i] == s[j] && s[i+1][j-1]
        int length = s.length();
        boolean[][] dp = new boolean[length+1][length+1];
        for(int i = 0; i <= length; i++){
            dp[i][i] = true;
        }
        if(length < 2){
            return s;
        }
        int maxLen = 1;//初始最大长度为1
        int begin = 0;//开始点为下标为0
       // char[] chars = s.toCharArray();//转换成数组
        for(int j = 2; j <= length; j++){
            for(int i = 1; i < j; i++){
               if(s.charAt(i-1) != s.charAt(j-1)){
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
                   maxLen = j - i + 1;//eg长度为2  开始为 3   3+2
                   begin = i;
               }

            }
        }
        return s.substring(begin,begin+maxLen);
    }
}
