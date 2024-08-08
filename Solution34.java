package suanfa;

/**
 * ClassName: Solution34
 * Package: suanfa
 * Description
 * 2
 * @Author HuanZ
 * @Create 2024/1/4 19:29
 * @Version 1.0
 */
public class Solution34 {

    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 1){
            if(nums[0] == target){
                return new int[]{0,0};
            }
            else {
                return new int[]{-1,-1};
            }
        }
        int length = nums.length;
        int left = 0;
        int right = length - 1;
        int result = -1;
        while (left <= right){
            int mid = (right + left)/2;

            if(nums[mid] > target){
                right = mid - 1;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                result = mid;
                break;
            }
        }
        if(result == -1){
            return new int[]{-1,-1};
        }

        int start = result;
        int end = result;

        while (start > 0 && nums[start - 1] == target) {
            start--;
        }

        while (end < length - 1  && nums[end + 1] == target) {
            end++;
        }

        return new int[]{start, end};
    }

}
