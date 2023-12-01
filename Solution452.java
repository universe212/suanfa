package suanfa;

import java.util.Arrays;

/**
 * ClassName: Solution452
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/13 20:56
 * @Version 1.0
 */
public class Solution452 {
    public int findMinArrowShots(int[][] points) {
      Arrays.sort(points,(a,b) -> Integer.compare(a[0],b[0]));
      int y = 1;
      for(int i = 0; i < points.length; i++){
          if(points[i][0] > points[i - 1][1] ){
              y++;
          }
          else {
              points[i][1] = Math.min(points[i-1][1],points[i][1]);
          }
      }
      return y;

    }
}
