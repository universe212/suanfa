package suanfa;

/**
 * ClassName: Solution474
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/15 18:45
 * @Version 1.0
 */
public class Solution474 {
    public int findMaxForm(String[] strs, int m, int n) {
      int[][]  dp = new int[m+1][n+1];
        for (String str : strs) {
            int zeroNum = 0;
            int oneNum = 0;
            for( char ch :str.toCharArray()){
                if(ch == '0'){
                    zeroNum++;
                }
                else {
                    oneNum++;
                }
            }
            for(int i = m; i >= zeroNum; i--){
                for(int j = n; j >= oneNum; j--){
                    dp[i][j] = Math.max(dp[i][j],dp[i - zeroNum][j -oneNum] + 1);
                }
            }
        }
return dp[m][n];
    }
}
