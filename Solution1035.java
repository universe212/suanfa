package suanfa;

/**
 * ClassName: Solution1035
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/23 16:19
 * @Version 1.0
 */
public class Solution1035 {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
    int[][] dp = new int[nums1.length][nums2.length];


    for(int i = 1; i <= nums1.length; i++){
        for(int j = 1; j <= nums2.length; j++){
            if(nums1[i-1] == nums2[j-1]){
                dp[i][j] = dp[i-1][j-1] + 1;
            }
            else {
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }

        }
    }
    return dp[nums1.length][nums2.length];
    }
}
