package suanfa;

/**
 * ClassName: Solution1020
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/11 18:49
 * @Version 1.0
 */
public class Solution1020 {
    private void dfs(int i, int y, int[][] grid, int l, int h) {
        if(i < 0 || y < 0 || i >= l || y >= h || grid[i][y] == 0){
            return;
        }
        grid[i][y] = 0;
        dfs(i-1,y,grid,l,h);
        dfs(i+1,y,grid,l,h);
        dfs(i,y+1,grid,l,h);
        dfs(i,y-1,grid,l,h);
    }

    public int numEnclaves(int[][] grid) {
        int l = grid.length;//行
        int h = grid[0].length;//列
        for(int i = 0; i < grid.length; i++){
            if(grid[i][0] == 1)//第一列
                dfs(i,0,grid,l,h);
            if(grid[i][grid[0].length - 1] == 1)//最后一列
                dfs(i,h-1,grid,l,h);
        }
        //初始化的時候，j 的上下限有調整過，必免重複操作。
        for(int j = 1; j < grid[0].length - 1; j++){
            if(grid[0][j] == 1)//第一行
                dfs(0,j,grid,l,h);
            if(grid[grid.length - 1][j] == 1)
                dfs(l-1,j,grid,l,h);//最后一行
        }
        int count = 0;

        for(int i = 1; i < grid.length - 1; i++){
            for(int j = 1; j < grid[0].length - 1; j++){
                if(grid[i][j] == 1)
                    count++;
            }
        }
        return count;
}
}
