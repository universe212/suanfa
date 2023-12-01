package suanfa;

/**
 * ClassName: Solution738
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/14 19:21
 * @Version 1.0
 */
public class Solution738 {
    public int monotoneIncreasingDigits(int n) {
     String s = String.valueOf(n);
        char[] chars = s.toCharArray();
        int start = s.length();
        for(int i = s.length() - 2; i > -1;i--){
            if(chars[i] > chars[i+1]){
                chars[i]--;
                start = i + 1;
            }
        }
        for(int i = start; i < s.length() ;i++){
            chars[i] = '9';
        }
        return Integer.parseInt(String.valueOf(chars));
    }
}
