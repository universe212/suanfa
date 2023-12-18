package suanfa;

/**
 * ClassName: Solution695
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/8 20:50
 * @Version 1.0
 */
public class Solution695 {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }
        int l = grid.length;//行
        int h = grid[0].length;//列
        int result = 0;
        int temp = 0;
        for(int i = 0; i < l; i++){
            for(int y = 0; y < h; y++){
                if(grid[i][y] == 1){
                    result = Math.max(result,dfs(i,y,grid,l,h,temp));
                }
            }
        }
        return result;
    }
    private int dfs(int i, int y, int[][] grid, int l, int h, int max) {
        if(i < 0 || y < 0 || i >= l || y >= h || grid[i][y] == 0){
            return 0;
        }

        grid[i][y] = 0;
        return  1+ dfs(i-1,y,grid,l,h,max)+dfs(i+1,y,grid,l,h,max)+dfs(i,y+1,grid,l,h,max) +dfs(i,y-1,grid,l,h,max);

    }
}

