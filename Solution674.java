package suanfa;

/**
 * ClassName: Solution674
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/22 18:22
 * @Version 1.0
 */
public class Solution674 {
    public int findLengthOfLCIS(int[] nums) {
        int l = nums.length;
        if(l == 1){
            return 1;
        }
        int max = 1;
        int min = 0;
        for(int i = 1; i < l; i++){
            if(nums[i] > nums[i - 1]){
                max++;
            }
            else {
                max = 1;
            }
            min = Math.max(max,min);
        }
        return min;
    }
}
