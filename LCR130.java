package suanfa;

/**
 * ClassName: LCR130
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/11 20:54
 * @Version 1.0
 */
public class LCR130 {
    int total = 0;
    int x = 0;
    int y = 0;
    public int wardrobeFinishing(int m, int n, int cnt) {
        Boolean[][] visiteds = new Boolean[m][n];
        for(int i = 0; i < m ; i++){
            for (int j =0; j < n; j++){
                visiteds[i][j] = false;
            }
        }
        dfs(visiteds,cnt,m,n,x,y);
        return total;
    }

    private void dfs(Boolean[][] visiteds, int cnt, int m, int n, int x, int y) {
        if(x < 0 || y < 0 || x >= m || y >= n || visiteds[x][y] == true||change(x) + change(y) > cnt){
            return;
        }
        visiteds[x][y] = true;
        total = total + 1;
        dfs(visiteds,cnt,m,n,x+1,y);
        //dfs(visiteds,cnt,m,n,x-1,y);
        //dfs(visiteds,cnt,m,n,x,y-1);
        dfs(visiteds,cnt,m,n,x,y+1);

    }
    private int change(int n){
        String numberStr = Integer.toString(Math.abs(n));
        char[] digitsArray = numberStr.toCharArray();

        // 将拆分得到的每个数字相加
        int sum = 0;
        for (char digitChar : digitsArray) {
            int digit = Character.getNumericValue(digitChar);
            sum += digit;
        }

        return sum;
    }


}
