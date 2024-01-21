package suanfa;

/**
 * ClassName: LCR162
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/19 20:31
 * @Version 1.0
 */
public class LCR162 {
    public int digitOneInNumber(int num) {
       return  f(num);
    }

    private int f(int num) {
        if(num <= 0){
            return 0;
        }
        String s = String.valueOf(num);
        int high = s.charAt(0) - '0';
        int pow = (int)Math.pow(10,s.length() - 1); //eg 123  获取 100
        int last = num - high*pow;
        if(high == 1){
            return last + 1 + f(last) + f(pow - 1); //首先先 0-99 然后是 123 分为 100 到 123  和 0-23

        }
        else {
            //998  pow = 100
            return  high*f(pow-1) + f(last) + pow;
            //首先是  又 0-99有high个  然后 低位 98 最后是 100-199有pow个
        }
    }
}
