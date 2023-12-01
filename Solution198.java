package suanfa;

/**
 * ClassName: Solution198
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/17 19:02
 * @Version 1.0
 */
public class Solution198 {
    public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
//        int[] dp = new int[nums.length];
//        dp[0] = nums[0];
//        dp[1] = Math.max(nums[0],nums[1]);
//        for(int i = 2; i < nums.length; i++){
//            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
//    }
//
//return dp[nums.length - 1];
        int x = 0, y = 0, z = 0;
        for(int i = 0; i < nums.length; i++){
            y = z;
            z = Math.max(y, x +nums[i]);
            x = y;
        }
        return z;

    }
}
