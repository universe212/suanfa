package suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: Solution51
 * Package: suanfa
 * Description
 * 2
 * @Author HuanZ
 * @Create 2023/11/8 15:59
 * @Version 1.0
 */
public class Solution51 {

      List<List<String>> res = new ArrayList<>();//创建一个 字符表

    public List<List<String>> solveNQueens(int n) {
        char[][] chessboard = new char[n][n];
        //给创建的矩阵填充.
        for (char[] c : chessboard) {
            Arrays.fill(c,'.');
        }
        //开始遍历
        backTrack(n,0,chessboard);
        return res;

    }


    public void backTrack(int n, int row, char[][] chessboard) {
        //遍历开始 如果行等于n说明到最后一行了
        if(row == n){
            res.add(Array2List(chessboard));
            return;
        }
        //判断这一行哪个位置可不可以放 皇后
     for(int i = 0; i < n; i++){
         if(isValid(row,i,n,chessboard)){
            chessboard[row][i] = 'Q';
            backTrack(n,row + 1,chessboard);//进入下一行 弹出来要么走不通 要么 走过了
            chessboard[row][i] = '.';//复原
         }
     }

    }

//把满足条件的加进去
    public List Array2List(char[][] chessboard) {
        ArrayList<String> cc = new ArrayList<>();

        for (char[] c : chessboard) { //挨个遍历每一行 这是二维
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
//检查135度
        for(int i = row - 1, j = col + 1; i >= 0&&j< n; i--,j++){
            if(chessboard[i][j] == 'Q'){
                return false;
            }
        }
        return true;

    }
    }




