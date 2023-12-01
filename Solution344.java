package suanfa;

/**
 * ClassName: Solution344
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/20 16:53
 * @Version 1.0
 */
public class Solution344 {
    public void reverseString(char[] s) {
      int l = 0;
      int r = s.length - 1;
      char temp ;
      while (l < r){
            temp = s[r];
            s[r] = s[l];
            s[l] = temp;
      }
    }


}
