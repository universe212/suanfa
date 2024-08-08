package suanfa;

/**
 * ClassName: Solution283
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/2/1 19:28
 * @Version 1.0
 */
public class Solution283 {
    public void moveZeroes(int[] nums) {
    int right = 0;
    for(int i = 0; i < nums.length; i++){
        if(nums[i] != 0){
            nums[right++] = nums[i];
        }
    }
    for(int i = right; i < nums.length; i++){
        nums[i] = 0;
    }

    }
}
