package suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: Solution51
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/8 15:59
 * @Version 1.0
 */
public class Solution51 {

      List<List<String>> res = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] chessboard = new char[n][n];
        for (char[] c : chessboard) {
            Arrays.fill(c,'.');
        }

        backTrack(n,0,chessboard);
        return res;

    }


    public void backTrack(int n, int row, char[][] chessboard) {
        if(row == n){
            res.add(Array2List(chessboard));
            return;
        }
     for(int i = 0; i < n; i++){
         if(isValid(row,i,n,chessboard)){
            chessboard[row][i] = 'Q';
            backTrack(n,row + 1,chessboard);
            chessboard[row][i] = '.';
         }
     }

    }


    public List Array2List(char[][] chessboard) {
        ArrayList<String> cc = new ArrayList<>();
        for (char[] c : chessboard) {
            cc.add(String.copyValueOf(c));
        }
return cc;
    }


    public boolean isValid(int row, int col, int n, char[][] chessboard) {
        //先判断列
        for(int i = row - 1; i >= 0; i--){
            if (chessboard[i][col] == 'Q'){
                return false;
            }
        }
        //判断45度
        for(int i = row - 1, j = col - 1; i >= 0&&j>= 0; i--,j--){
            if(chessboard[i][j] == 'Q'){
                return false;
            }
        }

        for(int i = row - 1, j = col + 1; i >= 0&&j< n; i--,j++){
            if(chessboard[i][j] == 'Q'){
                return false;
            }
        }
        return true;

    }
    }




