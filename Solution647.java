package suanfa;

/**
 * ClassName: Solution647
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/24 20:00
 * @Version 1.0
 */
public class Solution647 {
    public int countSubstrings(String s) {
        char[] chars = s.toCharArray();
        boolean[][] dp = new boolean[s.length()][s.length()];
        int result = 0;
        for(int i = s.length() - 1; i>=0; i--){
            for(int j = i; j < s.length() ;j++){
                if(chars[i] == chars[j]){
                    if(i - j >= -1){
                        result++;
                        dp[i][j] = true;
                    }
                    else if(dp[i+1][j-1]){
                        result++;
                        dp[i][j] = true;

                    }
                }
            }
        }
        return result;
    }
}
