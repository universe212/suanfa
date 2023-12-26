package suanfa;

/**
 * ClassName: Solution240
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/25 20:03
 * @Version 1.0
 */
public class Solution240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = matrix.length;
        int w = matrix[0].length;
        int x = 0 , y = w - 1;
        while (x<l && y>=0){
            if(matrix[x][y] == target){
                return true;
            }
            if(matrix[x][y] >  target){
            y--;
            }
            else {
                x++;
            }


        }
        return false;
    }
}
