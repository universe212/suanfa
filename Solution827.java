package suanfa;

import java.util.HashMap;
import java.util.HashSet;

/**
 * ClassName: Solution827
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/12 19:12
 * @Version 1.0
 */
public class Solution827 {
    private static final int[][] position = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};  // 四个方向

    /**
     * @param grid 矩阵数组
     * @param row 当前遍历的节点的行号
     * @param col 当前遍历的节点的列号
     * @param mark 当前区域的标记
     * @return 返回当前区域内 1 的数量
     */
    public int dfs(int[][] grid, int row, int col, int mark) {
      int ans = 0;
      grid[row][col] = mark;
        for (int[] current : position) {
            int curRow = row + current[0];
            int curCol = col + current[1];
            if(curRow < 0 || curRow >= grid.length || curCol < 0 || curCol >= grid.length)continue;
            if(grid[curRow][curCol] == 1){//判断是1进行 否则返回
                ans += 1 + dfs(grid,curRow,curCol,mark);
            }
        }
        return ans;
    }

    public int largestIsland(int[][] grid) {
        int ans = Integer.MIN_VALUE,size = grid.length, mark = 2;
        HashMap<Integer, Integer> getSize = new HashMap<>();
        for(int row = 0; row < size; row++){
            for(int col = 0; col < size; col++){
                if(grid[row][col] == 1){
                    int areaSize = 1 + dfs(grid,row,col,mark);
                    getSize.put(mark,areaSize);
                    mark++;
                }
            }
        }//完成后每个陆地都被标记mark
        for(int row = 0; row < size; row++){
            for(int col = 0; col < size; col++){
                if(grid[row][col] != 0) continue;
                HashSet<Integer> hashSet = new HashSet<>();
                int curSize = 1;
                for (int[] ints : position) {
                   int curRow = row + ints[0];
                    int curCol = col + ints[1];
                    if(curRow < 0 || curRow >= grid.length || curCol < 0 || curCol >= grid.length)continue;
                    int curMark = grid[curRow][curCol];
                    if(!getSize.containsKey(curMark) || hashSet.contains(curMark)) continue;
                    hashSet.add(curMark);
                    curSize +=getSize.get(curMark);
                }
                ans = Math.max(curSize,ans);

            }
        }
        return ans == Integer.MIN_VALUE ? size*size : ans;

        //首先遍历数组记录每一个岛屿 利用mark标记岛屿名称 hashmap 记录岛屿标记和 大小是就标记进入下一个dfs
        //重新遍历 遍历到0开始计算 上下左右  判断上下左右有没有岛屿，以及利用hashset是否已经加了这个岛屿
        // 如果有岛屿 加上hashmap的岛屿大小
        //记录 cursize+=岛屿大小  如果
    }
}
