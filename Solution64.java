package suanfa;

/**
 * ClassName: Solution64
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/10 19:21
 * @Version 1.0
 */
public class Solution64 {
    public int minPathSum(int[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
               if(i == 0 && j== 0) continue;
               else if(i == 0) grid[i][j] = grid[i][j] + grid[i][j-1];
               else if(j == 0) grid[i][j] = grid[i][j] + grid[i-1][j];
               else grid[i][j] = grid[i][j] + Math.min(grid[i-1][j],grid[i][j-1]);
            }
        }
      return grid[grid.length - 1][grid[0].length - 1];
    }
}
