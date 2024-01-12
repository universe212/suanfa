package suanfa;

/**
 * ClassName: Solution31
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/10 20:43
 * @Version 1.0
 */
public class Solution31 {

    public void nextPermutation(int[] nums) {
        //我们希望下一个数 比当前数大，这样才满足 “下一个排列” 的定义。因此只需要 将后面的「大数」与前面的「小数」交换，就能得到一个更大的数。比如 123456，将 5 和 6 交换就能得到一个更大的数 123465。
        //我们还希望下一个数 增加的幅度尽可能的小，这样才满足“下一个排列与当前排列紧邻“的要求。为了满足这个要求，我们需要：
        //在 尽可能靠右的低位 进行交换，需要 从后向前 查找
        //将一个 尽可能小的「大数」 与前面的「小数」交换。比如 123465，下一个排列应该把 5 和 4 交换而不是把 6 和 4 交换
        //将「大数」换到前面后，需要将「大数」后面的所有数 重置为升序，升序排列就是最小的排列。以 123465 为例：首先按照上一步，交换 5 和 4，得到 123564；然后需要将 5 之后的数重置为升序，得到 123546。显然 123546 比 123564 更小，123546 就是 123465 的下一个排列

       int i = nums.length - 2;
       while (i>=0 && nums[i] >= nums[i+1]){
           i--;
       }
       if(i >= 0){
       int j = nums.length - 1;
           while (j >= 0 && nums[j] <= nums[i]){
               j--;
           }
           swap1(nums,i,j);
    }
    // 反转数组的方法
   reverse1(nums,i+1);

}

    private void reverse1(int[] nums, int start) {
        int left = start;
        int right = nums.length - 1;
        while (left < right){
        swap1(nums, left,right);
        left++;
        right--;
        }
    }


    private void swap1(int[] nums, int i ,int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}