package suanfa;

/**
 * ClassName: Solution215
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/8 21:11
 * @Version 1.0
 */
public class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        int heapSize = nums.length; //求出 数组的长度
        buildMaxHeap(nums, heapSize);//进去 构建大顶堆
        for (int i = nums.length - 1; i >= nums.length - k + 1; --i) {
            swap(nums, 0, i);//和最小值交换顺序 然后还原成大顶堆
            --heapSize;//相当于删除最后一个元素
            maxHeapify(nums, 0, heapSize);
        }  //eg 求第二个最大 是不是删除一次 上面的就是第二个最大了
        return nums[0];
    }

    public void buildMaxHeap(int[] a, int heapSize) {
        for (int i = heapSize / 2; i >= 0; --i) {//这个i是求堆的性质
            maxHeapify(a, i, heapSize);  //找到一个中间位置 进去这个 里面  i表示此时的角标 ,heapSize表示 初始的中点，a是数组
        }//方法会递归地确保以 i 为根的子树满足大顶堆的性质
    }

    public void maxHeapify(int[] a, int i, int heapSize) {
        int l = i * 2 + 1, r = i * 2 + 2, largest = i; //堆的性质中，左子节点总是位于 2i + 1 处，右子节点总是位于 2i + 2 处
        if (l < heapSize && a[l] > a[largest]) {
            largest = l;//把大的角标给largest
        }
        if (r < heapSize && a[r] > a[largest]) {
            largest = r;
        }
        if (largest != i) {
            swap(a, i, largest);
            //值交换 是吧他们角标的交换了 不是角标没换
            maxHeapify(a, largest, heapSize);
        }
    }

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
