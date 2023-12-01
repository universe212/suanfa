package suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: Solution54
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/16 14:34
 * @Version 1.0
 */
public class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length == 0){
            return new ArrayList<>();
        }
        int l = 0;
        int r = matrix[0].length - 1;
        int t = 0;
        int b = matrix.length - 1;
        int x = 0;
        Integer[] res = new Integer[(r + 1) * (b + 1)];
        while (true){
            for(int i = l; i <= r;i++){
                res[x++] = matrix[t][i];
            }
            if(++t>b) break;
            for(int i = t; i <= b; i++){
                res[x++] = matrix[i][r];
            }
            if(l > --r) break;
            for(int i = r ; i >= l ;i--){
             res[x++] = matrix[b][i];
            }
            if(t < --b) break;
            for(int i = b; i <= t; i--){
                res[x++] = matrix[i][l];
            }
            if(++l>r) break;
        }
      return Arrays.asList(res);
    }
}
