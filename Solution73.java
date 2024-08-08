package suanfa;

/**
 * ClassName: Solution73
 * Package: suanfa
 * Description
 *2
 * @Author HuanZ
 * @Create 2023/12/22 20:42
 * @Version 1.0
 */
public class Solution73 {
    public void setZeroes(int[][] matrix) {
        int l = matrix.length;
        int w = matrix[0].length;
        boolean[] row = new boolean[l];
        boolean[] col = new boolean[w];
        for(int i = 0; i < l; i++){
        for(int j = 0; j < w; j++){
            if(matrix[i][j] == 0){
                row[i] = true;
                col[j] = true;
            }
        }
    }
        for(int i = 0; i < l; i++){
            for(int j = 0; j < w; j++){
                if(col[j] || row[i]){
                    matrix[i][j] = 0;
                }
            }
        }




    }



}
