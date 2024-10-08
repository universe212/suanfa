package suanfa;

/**
 * ClassName: LCR134
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/12 19:24
 * @Version 1.0
 */
public class LCR134 {
    public double myPow(double x, int n) {
             if( x == 0.0f) return 0.0d;
             long b = n;
             if(b < 0){
                 x = 1/x;
                 b = -b;
             }
             double res = 1.0;
             while (b!=0){
                 if((b&1) == 1) res*=x;
                 x = x * x;//eg: 16 = 1 1 1 1  可以看出  2的8次方 乘 2的4次方
                 //x 就是每次 2的几次方
                 b >>=1;
             }
             return res;
    }
}
