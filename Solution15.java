package suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: Solution15
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/19 20:52
 * @Version 1.0
 * 三树之和
 */
public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
        if(nums[i] > 0){
            return result;
        }
        if( i > 0 && nums[i] == nums[i-1]){
            continue;
        }
        int left = i+1;
        int right = nums.length - 1;
        while (left < right){
            int sums = nums[i] + nums[left] + nums[right];
            if(sums > 0){
                right--;
            }
            else if(sums < 0){
                left++;
            }
            else  {
                result.add(Arrays.asList(nums[i],nums[left] ,nums[right]));
                while (left < right && nums[left] == nums[left+1]){
                    left++;
                }
                while (  left < right && nums[right] == nums[right-1]){
                    right--;
                }
                left++;
                right--;
            }


        }

        }
        return result;
    }



}
