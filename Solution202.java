package suanfa;

import java.util.HashSet;

/**
 * ClassName: Solution202
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/19 16:24
 * @Version 1.0
 */
public class Solution202 {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)){
            seen.add(n);
            n = getNext(n);
        }
        return n == 1;
    }

    public boolean isHappy1(int n) {
       int slow = n;
       int fast = getNext(n);
       while (fast != 1 && slow!= fast){
           slow = getNext(slow);
           fast = getNext(getNext(fast));
       }
       return fast == 1;
    }

    private int getNext(int n) {
        int sumdigit = 0;
        while (n > 0){
            int d = n % 10;
            n = n / 10;
            sumdigit += d * d;
        }
        return sumdigit;
    }


}
