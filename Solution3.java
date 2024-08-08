package suanfa;

import java.util.HashSet;
import java.util.Set;

/**
 * ClassName: Solution3
 * Package: suanfa
 * Description
 *2
 * @Author HuanZ
 * @Create 2023/12/19 20:10
 * @Version 1.0
 */
public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> occ = new HashSet<>();
        int n = s.length();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = 0, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk < n && !occ.contains(s.charAt(rk))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i );
        }
        return ans;
    }
}
