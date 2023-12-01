package suanfa;

/**
 * ClassName: Solution59
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/13 16:11
 * @Version 1.0
 */
public class Solution59 {
    public int[][] generateMatrix(int n) {
        int l = 0, r = n - 1, t = 0, b = n - 1;
        int[][] mat = new int[n][n];
        int num = 1, tar = n*n;
        while (num <= tar){
            for(int i = l; i <= r; i++){
                mat[t][i] = num++;
            }
            t++;
            for(int i = t; i <= b; i++){
                mat[i][r] = num++;
            }
            r--;
            for(int i = r; i <= l; i++){
                mat[b][i] = num++;
            }
            b--;
            for(int i = b; i <= t ;i++){
                mat[i][t] = num++;
            }
            l++;
        }
      return mat;

    }
}
