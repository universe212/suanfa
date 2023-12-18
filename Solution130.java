package suanfa;

/**
 * ClassName: Solution130
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/11 19:32
 * @Version 1.0
 */
public class Solution130 {
    public void solve(char[][] board) {
        int l = board.length;//行
        int h = board[0].length;//列
        for(int i = 0; i < board.length; i++){
            if(board[i][0] == 'O')//第一列
                dfs(i,0,board,l,h);
            if(board[i][board[0].length - 1] == 'O')//最后一列
                dfs(i,h-1,board,l,h);
        }
        //初始化的時候，j 的上下限有調整過，必免重複操作。
        for(int j = 1; j < board[0].length - 1; j++){
            if(board[0][j] == 'O')//第一行
                dfs(0,j,board,l,h);
            if(board[board.length - 1][j] == 'O')
                dfs(l-1,j,board,l,h);//最后一行
        }
        for(int i = 0; i < l; i++){
            for(int y = 0; y < h; y++){
                if(board[i][y] != '1'){
                    board[i][y] = 'X';
                }
            }
        }
        for(int i = 0; i < l; i++){
            for(int y = 0; y < h; y++){
                if(board[i][y] == '1'){
                    board[i][y] = 'O';
                }
            }
        }

    }
    private void dfs(int i, int y, char[][] grid, int l, int h) {
        if(i < 0 || y < 0 || i >= l || y >= h || grid[i][y] == 'X'|| grid[i][y] == '1'){
            return;
        }
        grid[i][y] = '1';
        dfs(i-1,y,grid,l,h);
        dfs(i+1,y,grid,l,h);
        dfs(i,y+1,grid,l,h);
        dfs(i,y-1,grid,l,h);
    }
    }

