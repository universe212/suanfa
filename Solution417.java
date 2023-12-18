package suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Solution417
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/11 20:03
 * @Version 1.0
 */
public class Solution417 {
    // 四个位置
    private static final int[][] position = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
      //行上偏移量
      //列上偏移量

    /**
     * @param heights 题目给定的二维数组
     * @param row 当前位置的行号
     * @param col 当前位置的列号
     * @param sign 记录是哪一条河，两条河中可以一个为 0，一个为 1
     * @param visited 记录这个位置可以到哪条河
     */
    public void dfs(int[][] heights, int row, int col, int sign, boolean[][][] visited) {
        //sign是海洋
        for (int[] current: position) {
            int curRow = row + current[0], curCol = col + current[1];
            // 越界
            if (curRow < 0 || curRow >= heights.length || curCol < 0 || curCol >= heights[0].length)
                continue;
            // 高度不合适或者已经被访问过了 高度要大于
            if (heights[curRow][curCol] < heights[row][col] || visited[curRow][curCol][sign]) continue;
            visited[curRow][curCol][sign] = true;//sign来自那边就要那边
            dfs(heights, curRow, curCol, sign, visited);//向四面八方扩散
        }
    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rowSize = heights.length, colSize = heights[0].length;
        List<List<Integer>> ans = new ArrayList<>();
        // 记录 [row, col] 位置是否可以到某条河，可以为 true，反之为 false；
        // 假设太平洋的标记为 1，大西洋为 0
        boolean[][][] visited = new boolean[rowSize][colSize][2];
        for (int row = 0; row < rowSize; row++) {
            visited[row][colSize - 1][0] = true; //最后一列职置true  大西洋
            visited[row][0][1] = true; //第一列true 太平洋
            dfs(heights, row, colSize - 1, 0, visited); //最后一列初始传进去 最后一列第一个
            dfs(heights, row, 0, 1, visited);//第一列初始传进去
        }
        for (int col = 0; col < colSize; col++) {
            visited[rowSize - 1][col][0] = true;
            visited[0][col][1] = true;
            dfs(heights, rowSize - 1, col, 0, visited);
            dfs(heights, 0, col, 1, visited);
        }
        for (int row = 0; row < rowSize; row++) {
            for (int col = 0; col < colSize; col++) {
                // 如果该位置即可以到太平洋又可以到大西洋，就放入答案数组
                if (visited[row][col][0] && visited[row][col][1])
                    ans.add(List.of(row, col));
            }
        }
        return ans;
    }
}
