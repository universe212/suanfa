package suanfa;

/**
 * ClassName: Solution55
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/9 19:26
 * @Version 1.0
 */
public class Solution55 {
    public boolean canJump(int[] nums) {
      int  n = nums.length;
      int des = 0;
      for(int i = 0; i < n; i++) {
          if (i <= des) { //要判断如果走到0上面的时候 i会增加 但是步数不增加 des表示能走到的地方
              des = Math.max(i + nums[i], des);
              if (des >= n - 1) {
                  return true;
              }
          }
      }
      return  false;
    }
}
