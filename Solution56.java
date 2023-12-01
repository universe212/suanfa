package suanfa;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * ClassName: Solution56
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/14 16:44
 * @Version 1.0
 */
public class Solution56 {
    public int[][] merge(int[][] intervals) {
        LinkedList<int[]> res = new LinkedList<>();
        int[][] ints = new int[intervals.length][intervals[0].length];
        Arrays.sort(intervals,(a,b) ->{
            return Integer.compare(a[0],b[0]);
        });
        res.add(intervals[0]);
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] <= res.getLast()[1]){
                int end = Math.max(res.getLast()[1],intervals[i][1]);
                int start = res.getLast()[0];
                res.removeLast();
                res.add(new int[]{start,end});
            }
            else {
                res.add(intervals[i]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
