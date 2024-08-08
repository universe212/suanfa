package suanfa;

/**
 * ClassName: Solution41
 * Package: suanfa
 * Description
 *1
 * @Author HuanZ
 * @Create 2023/12/22 20:00
 * @Version 1.0
 */
public class Solution41 {
    public int firstMissingPositive(int[] nums) {
       int n = nums.length;
       for(int i = 0; i < n;i++){
           if(nums[i] <= 0){
               nums[i] = n + 1;
           }
       }

       for(int i = 0; i < n; i++){
           int num = Math.abs(nums[i]);

           if(num < n + 1){
               //满足条件变成负数
               nums[num - 1] = -Math.abs( nums[num - 1]);//因为数组下表从0开始所以 num表示数组的第几个元素的下标要减一
           }
       }
//1-134
       for(int i = 0; i < n; i++){
           if(nums[i] > 0){
               return i+1;
           }
       }
        //核心思想就是 出现的范围是 1到数组长度+1可能的值，答案是n+1说明前面数字都是有序出现
        //先把负数剔除范围，其次从第一个数字遍历第一个数字是2说明2出现了，用下标代替出现的数字
        //所以把下表num-1 表示 num出现了置为负数
        //最后把第一个为整数的说明缺少那个数字
        return n+1;
    }
}
