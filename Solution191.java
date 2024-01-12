package suanfa;

/**
 * ClassName: Solution191
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/12 19:15
 * @Version 1.0
 */
public class Solution191 {
    public int hammingWeight(int n) {
      int res = 0;
      while (n!=0){
          res += n&1;
          n>>>=1;
      }
      return res;
    }


}
