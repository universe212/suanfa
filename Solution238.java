package suanfa;

/**
 * ClassName: Solution238
 * Package: suanfa
 * Description
 *2
 * @Author HuanZ
 * @Create 2023/12/22 19:35
 * @Version 1.0
 */
public class Solution238 {
    public int[] productExceptSelf(int[] nums) {
       int l = nums.length;
        int[] ints = new int[nums.length];
        //ints表示对应的左边之和
        ints[0] = 1;
        for(int i = 1; i < l; i++){
            ints[i] = nums[i-1]*ints[i-1];//统计i的左边之和
        }
        int R = 1; //表示右边之和
        int[] result = new int[l];
        for (int j = l - 1; j >= 0; j--){
          result[j] = ints[j] * R;
          R *=nums[j];
        }
        return result;
    }


//    int[] dp = new int[nums.length];
//    dp[0] = 1;
//        for(int i = 1; i < nums.length; i++){
//        dp[i] = dp[i-1]*nums[i-1];
//    }
//    int[] dp1 = new int[nums.length];
//    dp1[nums.length - 1] = 1;
//        for(int i = nums.length - 2; i >= 0 ;i--){
//        dp1[i] = dp1[i+1] * nums[i+1];
//    }
//    int[]  result = new int[nums.length];
//        for(int i = 0; i < nums.length; i++){
//        result[i] = dp[i]*dp1[i];
//    }
//        return result;
}
