package suanfa;

/**
 * ClassName: Solution48
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/25 19:47
 * @Version 1.0
 */
public class Solution48 {
    public void rotate(int[][] matrix) {
        int l = matrix.length;
        int w = matrix[0].length;
        int[][] ints = new int[l][w];
        for(int i = 0; i <l; i++){
            for(int j = 0;j < l;j++){
                ints[i][j] = matrix[i][j];
            }
        }

        for(int i = 0; i <l; i++){
            for(int j = 0;j < l;j++){
                matrix[j][l-1-i] = ints[i][j];
            }
        }

    }
}
