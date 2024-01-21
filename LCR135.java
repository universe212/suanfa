package suanfa;

/**
 * ClassName: LCR135
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/12 19:41
 * @Version 1.0
 */
public class LCR135 {
    public int[] countNumbers(int cnt) {
      int i = 1;
      int x = (int) Math.pow(10,cnt);
        int[] ints = new int[x - 1];
      for(int j = 0; j < ints.length;j++){
          ints[0] = i;
          i++;
          if(i % x == 1){
              break;
          }
      }
      return ints;
    }
}
