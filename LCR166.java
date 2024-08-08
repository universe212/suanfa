package suanfa;

/**
 * ClassName: LCR166
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/21 20:31
 * @Version 1.0
 */
public class LCR166 {

    public int jewelleryValue(int[][] frame) {
        int x = frame.length;
        int y = frame[0].length;

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                if(i == 0 && j == 0)continue;
                 if (i == 0) frame[i][j] += frame[i][j-1];
                else if (j == 0) frame[i][j] += frame[i-1][j];
                else frame[i][j] = Math.max(frame[i-1][j],frame[i][j-1]);
            }
        }
        return frame[x-1][y-1];
    }
}
