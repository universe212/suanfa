package suanfa;

import java.util.Arrays;

/**
 * ClassName: LCR164
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/21 19:48
 * @Version 1.0
 */
public class LCR164 {
    public String crackPassword(int[] password) {
        String[] strs = new String[password.length];
        for(int i = 0; i < password.length; i++)
            strs[i] = String.valueOf(password[i]);

        Arrays.sort(strs,(a,b) -> (a+b).compareTo(b+a));
        StringBuilder res = new StringBuilder();
        for(String s : strs)
            res.append(s);
        return res.toString();
    }
}
