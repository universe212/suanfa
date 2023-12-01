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
    int end = 0;
    int max = 0;
    for(int i = 0; i < n - 1; i++){ // n - 1防止 i 遍历到终点的时候已经到达了还进一次Path循环，就是刚刚好打终点 end 这样i到end还要进一次if
        max = Math.max(nums[i] + i, max); //当到达i点比较 i点此时出发和 之前最大值
        if(i == end){
            end = max;
            path++;
        }
    }
       return path;

    }
}
