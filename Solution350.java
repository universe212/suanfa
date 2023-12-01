package suanfa;

import java.util.*;

/**
 * ClassName: Solution350
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/19 15:57
 * @Version 1.0
 */
public class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            }

        }
        int index = 0;
        int[] ints = new int[list.size()];
        for (Integer integer : list) {
            ints[index++] = integer;
        }

        return ints;
    }


}
