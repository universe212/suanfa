package suanfa;

import java.util.HashMap;

/**
 * ClassName: Solution454
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/19 20:31
 * @Version 1.0
 */
public class Solution454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i : nums1) {
            for (int i1 : nums2) {
                result.put(i+i1,result.getOrDefault(i+i1,0)+1);
            }
        }
        int count = 0;
        for (int i : nums3) {
            for (int i1 : nums4) {
                if(result.containsKey(0 - (i+i1))){
                    count += result.get(0-(i+i1));
                }
            }

        }
        return count;

    }
}
