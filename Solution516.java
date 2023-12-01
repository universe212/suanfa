package suanfa;

/**
 * ClassName: Solution516
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/24 20:13
 * @Version 1.0
 */
public class Solution516 {
    public int longestPalindromeSubseq(String s) {
        char[] chars = s.toCharArray();
        int[][] dp = new int[s.length()+1][s.length()+1];
       for (int i = s.length() - 1; i >= 0; i--){
           dp[i][i] = 1;
           for(int j = i + 1; j < s.length(); j++){
               if(chars[i] == chars[j]){
                   dp[i][j] = dp[i+1][j-1]+2;
               }
               else {
                   dp[i][j] = Math.max(dp[i + 1][j], Math.max(dp[i][j], dp[i][j - 1]));
               }
           }
       }
       return dp[0][s.length()-1];

    }
}
