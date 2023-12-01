package suanfa;

/**
 * ClassName: Solution63
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/30 16:41
 * @Version 1.0
 */
public class Solution63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] ints = new int[m][n];
        ints[0][0] = (obstacleGrid[0][0] == 1) ? 0 : 1;
        for(int i = 1; i < m; i++){
            if(obstacleGrid[i][0] == 1 ||  ints[i - 1][0] == 0){
                ints[i][0] = 0;
            }
            else {
                ints[i][0] = 1;
            }
        }
        for(int i = 1; i < n; i++){
            if(ints[0][i - 1] == 0||obstacleGrid[0][i] == 1 ){
                ints[0][i] = 0;
            }
            else {
                ints[0][i] = 1;
            }
        }
        for(int i = 1; i < m;i++){
            for(int j = 1; j < n; j++){
                if(obstacleGrid[i][j] == 1){
                    ints[i][j] = 0;
                }
                else {
                    ints[i][j] = ints[i-1][j] + ints[i][j-1];
                }
            }
        }
        return ints[m-1][n-1];
    }
}
