package suanfa;

/**
 * ClassName: Solution79
 * Package: suanfa
 * Description
 * 2
 * @Author HuanZ
 * @Create 2024/1/3 20:33
 * @Version 1.0
 */
public class Solution79 {

    public boolean exist(char[][] board, String word) {
        int l = board.length;
        int w = board[0].length;
        char c = word.charAt(0);
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < w; j++) {
                if (board[i][j] == c) {
                    if (dfs(board, 0, i, j, word)) {
                        return true; // 如果找到一条路径，直接返回true
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int i, int i1, int j, String word) {
        if (i1 < 0 || j < 0 || i1 >= board.length || j >= board[0].length || i > word.length() - 1 || board[i1][j] != word.charAt(i) || board[i1][j] == '1') {
            return false;
        }
        if (i == word.length() - 1 && board[i1][j] == word.charAt(i)) {
            return true;
        }
        char temp = board[i1][j];
        board[i1][j] = '1'; // 标记为访问过
        boolean found = dfs(board, i + 1, i1 + 1, j, word) ||
                dfs(board, i + 1, i1 - 1, j, word) ||
                dfs(board, i + 1, i1, j + 1, word) ||
                dfs(board, i + 1, i1, j - 1, word);
        board[i1][j] = temp; // 恢复原值
        return found;
    }

}
