package suanfa;

/**
 * ClassName: Solution153
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/4 20:50
 * @Version 1.0
 */
public class Solution153 {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int min = Integer.MAX_VALUE;
        while (left <= right){
            int mid = (right + left + 1)/2; //这个公式记住

            if(nums[left] <= nums[mid]){//说明左边有序 但是不是绝对
               min = Math.min(min,nums[left]);
                left = mid + 1;
            }
            else {//右边有序 至少又一边有序 不可能两边都无序
                min = Math.min(min,nums[mid]);
                right = mid - 1;
            }
        }
        return min;
    }
}
