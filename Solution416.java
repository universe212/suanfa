package suanfa;

/**
 * ClassName: Solution416
 * Package: suanfa
 * Description
 * 2
 * @Author HuanZ
 * @Create 2023/10/31 16:20
 * @Version 1.0
 */
public class Solution416 {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        if (sum % 2 != 0) return false;
        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];//0-target
        dp[0] = true;
        for (int i = 0; i < nums.length; i++) {//i确定数组的值
            for (int j = target; j >= nums[i]; j--) {
                dp[j] = dp[j] || dp[j - nums[i]];
            }
        }
        return dp[target];

//       int len = nums.length;
//       int sum = 0;
//        for (int num : nums) {
//            sum += num;
//        }
//        if((sum & 1) == 1){
//            return false;
//        }
//        int target = sum / 2;
//        boolean[][] dp = new boolean[len][target + 1];
//        if(nums[0] <= target){
//            dp[0][nums[0]] = true;
//        }
//        for(int i = 1; i < len; i++){
//            for(int j = 1; j <= target; j++){
//                dp[i][j] = dp[i-1][j];
//                if(nums[i] == target){
//                    dp[i][j] = true;
//                }
//                if(nums[i] < j){
//                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i]];
//                }//大于j依旧遵循前面得
//            }
//        }
//        return dp[len - 1][target];
    }
}
