package suanfa;

/**
 * ClassName: Solution35
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/2/29 20:20
 * @Version 1.0
 */
public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }
}
