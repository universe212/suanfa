package suanfa;

/**
 * ClassName: Solution463
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/14 20:50
 * @Version 1.0
 */
public class Solution463 {
    public int islandPerimeter(int[][] grid) {
            int l = grid.length;//行
            int h = grid[0].length;//列
        int max = 0;
        int result = 0;
            for(int i = 0; i < l; i++){
               for(int j = 0; j < h;j++){
                   if (grid[i][j] == 1){
                       result = dfs(i,j,grid,l,h);
                   }
               }
            }
            return result;
    }
        private int dfs(int i, int y, int[][] grid, int l, int h) {
            if(i < 0 || y < 0 || i >= l || y >= h || grid[i][y] == 0){
                return 1;
            }
            if(grid[i][y] == -1){
                return 0;
            }
            grid[i][y] = -1;
            return dfs(i - 1, y, grid, l, h) + dfs(i + 1, y, grid, l, h) + dfs(i, y - 1, grid, l, h) + dfs(i, y + 1, grid, l, h);
        }
}
