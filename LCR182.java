package suanfa;

/**
 * ClassName: LCR182
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/23 20:53
 * @Version 1.0
 */
public class LCR182 {
    public String dynamicPassword(String password, int target) {
     String s = new String(password+password);
     int l = password.length();
     return s.substring(target,l+target+1);
    }
}
