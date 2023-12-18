package suanfa;

/**
 * ClassName: Solution200
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/8 20:21
 * @Version 1.0
 */
public class Solution200 {

    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }
        int l = grid.length;//行
        int h = grid[0].length;//列
        int result = 0;
        for(int i = 0; i < l; i++){
            for(int y = 0; y < h; y++){
                if(grid[i][y] == '1'){
                    result++;
                    dfs(i,y,grid,l,h);
                }
            }
        }
        return result;
    }

    private void dfs(int i, int y, char[][] grid, int l, int h) {
        if(i < 0 || y < 0 || i >= l || y >= h || grid[i][y] == '0'){
            return;
        }
        grid[i][y] = '0';
        dfs(i-1,y,grid,l,h);
        dfs(i+1,y,grid,l,h);
        dfs(i,y+1,grid,l,h);
        dfs(i,y-1,grid,l,h);

    }

}
