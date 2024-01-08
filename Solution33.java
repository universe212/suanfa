package suanfa;

/**
 * ClassName: Solution33
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/4 20:14
 * @Version 1.0
 */
public class Solution33 {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = (right + left + 1)/2; //这个公式记住
            if(nums[mid] == target){
                return mid;
            }

            if(nums[left] <= nums[mid]){//说明左边有序 但是不是绝对
                if(nums[left] <= target && target <= nums[mid]){
                    right = mid - 1; //左边有序 且目标值在范围内
                }
                else {
                    left = mid + 1; //左边有序 但是目标值不在
                }
            }
            else {//右边有序 至少又一边有序 不可能两边都无序
                if(nums[right] >= target && target >= nums[mid]){
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
