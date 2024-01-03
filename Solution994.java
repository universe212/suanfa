package suanfa;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ClassName: Solution994
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/2 19:19
 * @Version 1.0
 */
public class Solution994 {

    int[][] dire = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int orangesRotting(int[][] grid) {
        int m = grid.length, n = grid[0].length, count = 0, step = 0;
        Deque<int[]> queue = new ArrayDeque<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    count++; //统计好的果数量
                }else if(grid[i][j] == 2){
                    queue.offer(new int[]{i, j}); //把坏的都进队列
                }
            }
        }
        if(count == 0){
            return 0;
        }
        while(!queue.isEmpty()){
            int size = queue.size(); //queue的值
            for(int i = 0; i < size; i++){
                int[] temp = queue.poll(); //弹出第一个
                for(int[] item : dire){
                    int newrow = item[0] + temp[0], newcol = item[1] + temp[1]; //遍历四个方向
                    if(newrow >=0 && newrow < m && newcol >= 0 && newcol < n && grid[newrow][newcol] == 1){
                        grid[newrow][newcol] = 2;
                        queue.offer(new int[]{newrow, newcol});//进队列 相当于 第二波进队列  一波一波扩散 广度更加
                        count--; //好橘子少一个
                    }
                }
            }
            step++;
        }
        return count == 0 ? step - 1 : -1;
    }
















//
//    public int orangesRotting(int[][] grid) {
//        if (grid == null || grid.length == 0) return 0;
//        int m = grid.length;
//        int n = grid[0].length;
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (grid[i][j] == 2) {
//                    dfs(grid, i, j, 2); //初始时间设置为2主要是为了 与腐烂2区分开
//                }
//            }
//        }
//        int maxTime = 0;
//        for (int i=0;i<m;i++) {
//
//            for (int j=0;j<n;j++) {
//
//                if (grid[i][j] == 1) return -1;
//                else maxTime = Math.max(maxTime, grid[i][j]);
//            }
//        }
//        return maxTime == 0 ? 0 : maxTime - 2;
//    }
//
//    private void dfs(int[][] grid, int i, int j, int time) {
//        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
//            return;
//        }
//        if (grid[i][j] != 1 && grid[i][j] < time) return; //他是腐烂的并且 时间 小于说明已经访问了
//        grid[i][j] = time;
//        dfs(grid, i + 1, j, time + 1);//int 值传递只会影响下一级
//        dfs(grid, i - 1, j, time + 1);
//        dfs(grid, i, j + 1, time + 1);
//        dfs(grid, i, j - 1, time + 1);
//
//    }
}
