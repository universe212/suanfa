package suanfa;

/**
 * ClassName: Solution53
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/9 16:18
 * @Version 1.0
 */
public class Solution53 {
    public int maxSubArray(int[] nums) {
//        int[] ints = new int[nums.length];
//        int max = Integer.MIN_VALUE;
//        int sum = 0;
//        for(int i = 0; i < nums.length; i++){
//          sum += nums[i];
//          if(sum > max){
//              max = sum;
//          }
//          else {
//              sum = 0;
//          }
//
//        }
//        return max;

        int ans = Integer.MIN_VALUE;
        int[] result = new int[nums.length];
        result[0] = nums[0];
        ans = nums[0];
        for(int i = 1; i < nums.length; i++){
             result[i] = Math.max(result[i-1] + nums[i], nums[i] );
             ans = Math.max(ans,result[i]); //和前面合并 不合并
        }
return ans;

    }
}
