package suanfa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * ClassName: Solution349
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/19 15:17
 * @Version 1.0
 */
public class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> parent = new HashSet<>();
        Set<Integer> children = new HashSet<>();
        for (int i : nums1) {
            parent.add(i);
        }
        for (int i : nums2) {
            if (parent.contains(i)) {
                children.add(i);
            }
        }
        int[] ints = new int[children.size()];
        int i = 0;
        for (Integer child : children) {
            ints[i] = child;
            i++;
        }

        return ints;
    }
    public int[] intersection2(int[] nums1, int[] nums2) {
        HashSet<Integer> cnts = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                cnts.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else if (nums1[i] > nums2[i]){
                j++;
            }
        }
        int[] ints = new int[cnts.size()];
        int q = 0;
        for (Integer cnt : cnts) {
            ints[q++] = cnt;
        }
        return ints;


    }
}
