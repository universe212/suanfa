package suanfa;

/**
 * ClassName: Solution74
 * Package: suanfa
 * Description
 *  2
 * @Author HuanZ
 * @Create 2024/1/3 21:07
 * @Version 1.0
 */
public class Solution74 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int low = 0, high = m * n - 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            int x = matrix[mid / n][mid % n];
            if (x < target) {
                low = mid + 1;
            } else if (x > target) {
                high = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

}
