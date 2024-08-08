package suanfa;

/**
 * ClassName: Solution45
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/9 19:54
 * @Version 1.0
 */
public class Solution45 {
    public int jump(int[] nums) {
    int n = nums.length;
    int path = 0;
    int end = 0;//当前覆盖最远距离
    int max = 0;
    for(int i = 0; i < n - 1; i++){
        //小于n-1因为是到达最后一个点所以最后一步是无意义的
        //max 下一步覆盖最远
        max = Math.max(nums[i] + i, max);
        // 可达位置的改变次数就是跳跃次数
        //不相等说明 此时i没到达指定位置不更新 一个追赶过程
        if(i == end){//当i==end 说明到达指定位置 此时更新跳跃最大值
            end = max;
            path++;
        }
    }
       return path;

    }
}
