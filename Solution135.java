package suanfa;

/**
 * ClassName: Solution135
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/13 18:49
 * @Version 1.0
 */
public class Solution135 {
    public int candy(int[] ratings) {
      int l = ratings.length;
      int[]  crr = new int[l];
      crr[0] = 1;
      for(int i = 1; i < l; i++){
          if(ratings[i] > ratings[i - 1]){
              crr[i] = crr[i - 1] + 1;
          }
      }
      for(int j = l - 2; j > -1; j--){
          if(ratings[j] > ratings[j - 1]){
              crr[j] = Math.max(crr[j],crr[j + 1] + 1);
          }
      }
      int num = 0;
        for (int i : crr) {
            num += i;
        }
return num;
    }
}
