package suanfa;

/**
 * ClassName: Solution11
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/19 19:46
 * @Version 1.0
 */
public class Solution11 {
    public int maxArea(int[] height) {

     int n = height.length;
     int left = 0;
     int right = n - 1;
     int max = 0;
     while (left < right ){
         int area = Math.min(height[left],height[right]) * (right - left);
         max = Math.max(area,max);

         if(height[left] <= height[right]){
             left++;
         }
         else {
             right--;
         }
     }
     return max;
    }
}
