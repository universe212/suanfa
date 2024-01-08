package suanfa;

/**
 * ClassName: Solution74
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/3 21:07
 * @Version 1.0
 */
public class Solution74 {

    public boolean searchMatrix(int[][] mat, int t) {
        int m = mat.length, n = mat[0].length; //m是行 n是列

        // 第一次二分：定位到所在行（从上往下，找到最后一个满足 mat[x]][0] <= t 的行号）
        int l = 0, r = m - 1;
        while (l < r) {
            int mid = l + r + 1 >> 1;//除以2 固定思路  保证了 lr逼近最终相等
            if (mat[mid][0] <= t) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }

        int row = l;
        if (mat[row][0] == t) return true;
        if (mat[row][0] > t) return false;

        // 第二次二分：从所在行中定位到列（从左到右，找到最后一个满足 mat[row][x] <= t 的列号）
        l = 0; r = n - 1; //n是列
        while (l < r) {
            int mid = l + r + 1 >> 1;
            if (mat[row][mid] <= t) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        int col = l;

        return mat[row][col] == t;


    }

}
