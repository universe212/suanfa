package suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: LCR180
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/23 20:32
 * @Version 1.0
 */
public class LCR180 {
    public int[][] fileCombination(int target) {
          int left = 1;
          int right = 2;
          int sum = 3;
        List<int[]> res = new ArrayList<>();
        while (left<right){
            if(sum == target){
                int[] ans = new int[right-left+1];
                for(int k = left; k <= right; k++){
                    ans[k-left] = k;

                }
                res.add(ans);
            }
            if(sum <= target){
                right++;
                sum += right;
            }
            else {
                sum -= left;
                left++;
            }

          }
        return res.toArray(new int[0][]);
    }
}
