package suanfa;

/**
 * ClassName: LCR146
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/16 15:25
 * @Version 1.0
 */
public class LCR146 {
    public int[] spiralArray(int[][] array) {
      int l = 0, r = array[0].length - 1, t = 0 ,b = array.length - 1;
        int[] res = new int[(b + 1) * (r + 1)];
        int num = 0;
        while (true){
            for(int i = l; i <= r;i++){
                res[num++] = array[t][i];
            }
            if(++t>b)break;
            for(int i = t; i <= b;i++){
                res[num++] = array[i][r];
            }
            if(--r < l)break;
            for(int i = r; i >= l; i--){
                res[num++] = array[b][i];
            }
            if(--b<t)break;
            for(int i = b; i >= t; i--){
                res[num++] = array[i][l];
            }
            if(++l>r)break;
        }
        return res;
    }

}
