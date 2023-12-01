package suanfa;

/**
 * ClassName: Solution718
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/22 18:28
 * @Version 1.0
 */
public class Solution718 {
    public int findLength(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length + 1][nums2.length + 1];
        int result = 0;
        for(int i = 1; i <= nums1.length; i++){
            for(int j = 1; j <= nums2.length; j++){
                if(nums1[i - 1] == nums2[ j - 1]){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                result = Math.max(result,dp[i][j]);
            }
        }
        return result;
    }
}
