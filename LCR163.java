package suanfa;

/**
 * ClassName: LCR163
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/19 21:19
 * @Version 1.0
 */
public class LCR163 {
    public int findKthNumber(int k) {
        long digit = 1;//几位数字
        long start = 1; //开始位置数字
        long count = 9;//个位数一共多少个
           while (k > count){
               k -= count;//eg k = 22 22-9  = 13   14
               digit += 1;//
               start *= 10;
               count = digit * start * 9;//180
           }
           //找到了 k是几位数
          long num = start + (k-1)/digit;//start为1 eg k = 5 算出来就是6要加start 所以减一个
          String s = Long.toString(num);
        int res = s.charAt((int) ((k-1)%digit)) - '0';
          return res;
    }
}
