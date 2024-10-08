package suanfa;

/**
 * ClassName: LCR138
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/12 22:11
 * @Version 1.0
 */
public class LCR138 {
    public boolean validNumber(String s) {
        if (s == null || s.length() == 0) return false;
        //去掉首位空格
        s = s.trim();
        boolean numFlag = false;//数字
        boolean dotFlag = false;//小数
        boolean eFlag = false;//e
        for (int i = 0; i < s.length(); i++) {
            //判定为数字，则标记numFlag
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                numFlag = true;
                //判定为.  需要没出现过.并且没出现过e
            } else if (s.charAt(i) == '.' && !dotFlag && !eFlag) {
                //点前面没点和e
                dotFlag = true;
                //判定为e，需要没出现过e，并且出过数字了
            } else if ((s.charAt(i) == 'e' || s.charAt(i) == 'E') && !eFlag && numFlag ) {
                //e的前面有 数字没有e
                eFlag = true;
                numFlag = false;//为了避免123e这种请求，出现e之后就标志为false
                //判定为+-符号，只能出现在第一位或者紧接e后面
            } else if ((s.charAt(i) == '+' || s.charAt(i) == '-') && (i == 0 || s.charAt(i - 1) == 'e' || s.charAt(i - 1) == 'E')) {
         //+ -前面0或者为e
                //其他情况，都是非法的
            } else {
                return false;
            }
        }
        return numFlag;
    }
}
