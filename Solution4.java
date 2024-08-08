package suanfa;

/**
 * ClassName: Solution4
 * Package: suanfa
 * Description
 * 2
 * @Author HuanZ
 * @Create 2024/1/4 21:09
 * @Version 1.0
 */
public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int lMid = (n + m + 1) / 2; //k eg技术 12345  left  3 right 3 偶数 123456 left 3 4合理
        int rMid = (n + m + 2) / 2; //k 把奇数偶数合并 123456
        //将偶数和奇数的情况合并，如果是奇数，会求两次同样的 k 。
        return (getKth(nums1, 0, n - 1, nums2, 0, m - 1, lMid) + getKth(nums1, 0, n - 1, nums2, 0, m - 1, rMid)) * 0.5;
    }

    private int getKth(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k) {
        int len1 = end1 - start1 + 1;//len1 是 nums1
        int len2 = end2 - start2 + 1;//len2 是 nums2  均是现存长度

        //让 len1 的长度小于 len2，这样就能保证如果有数组空了，一定是 len1
        if (len1 > len2) return getKth(nums2, start2, end2, nums1, start1, end1, k);//如果这样直接交换位置
        if (len1 == 0) return nums2[start2 + k - 1]; //如果1为0 直接返回 2的中位数即可 此时中位数不一定是第K个，K在变

        if (k == 1) return Math.min(nums1[start1], nums2[start2]);//当K等于1 返回 12数组 第一个最小的即可
//因为k 是两个加起来的中间值所以这里是  k/2
        int i = start1 + Math.min(len1, k/ 2) - 1;//i表示 start + len1当前值 和 2/k 最小值，如果 len1为
        int j = start2 + Math.min(len2, k / 2) - 1;//出现 1 不影响  角标减一 那个加一

        if (nums1[i] > nums2[j]) {
            return getKth(nums1, start1, end1, nums2, j + 1, end2, k - (j - start2 + 1));//j 是角标 k是个数分清楚
            //如果 Nums[i]大于则 nums1不变  nums2前面k/2个删除 同时  k 也要减去 k/2
        }
        else {
            return getKth(nums1, i + 1, end1, nums2, start2, end2, k - (i - start1 + 1));
        }//这两种情况知道

        }
}
