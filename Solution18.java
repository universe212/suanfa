package suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: Solution18
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/20 16:13
 * @Version 1.0
 */
public class Solution18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> result = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > 0 && nums[j] > target) {
                return result;
            }//判断如果已经 大于目标值直接结束
            if (j > 0 && nums[j] == nums[j - 1]) {
                continue; //判断是不是重复
            }
            for (int i = j + 1; i < nums.length; i++) {

                if (i > j + 1 && nums[i - 1] == nums[i]) {
                    continue; //防止越界
                }
                int left = i + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sums = nums[i] + nums[left] + nums[right] + nums[j];
                    if (sums > target) {
                        right--;
                    } else if (sums < target) {
                        left++;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right], nums[j]));
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    }


                }

            }
        }
        return result;
    }
}
