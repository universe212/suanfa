package suanfa;

import java.util.Arrays;

/**
 * ClassName: Solution435
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/13 21:27
 * @Version 1.0
 */
public class Solution435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> {
          return Integer.compare(a[0],b[0]);
        });
        int count = 1;
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] < intervals[i-1][1]){
                //重叠了
                intervals[i][1] = Math.min(intervals[i-1][1],intervals[i][1]);
                continue;
            }
            else {
                count++;
            }
        }
        return intervals.length - count;
    }
    }

