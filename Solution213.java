package suanfa;

/**
 * ClassName: Solution213
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/17 19:19
 * @Version 1.0
 */
public class Solution213 {
    public int rob(int[] nums) {
      if(nums.length == 0){
          return 0;
      }
        if(nums.length == 1){
            return nums[0];
        }
        int l = nums.length;
        return Math.max(robAction(nums,0,l-1),robAction(nums,1,nums.length));
    }

    int robAction(int[] nums, int start, int end) {
        int x = 0,y,z = 0;
      for(int i = start; i < end; i++){
          y = z;
          z = Math.max(y,x + nums[i]);
          x = y;
      }
      return z;
    }
}
