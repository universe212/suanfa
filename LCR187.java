package suanfa;

/**
 * ClassName: LCR187
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/26 19:36
 * @Version 1.0
 */
public class LCR187 {
    public int iceBreakingGame(int num, int target) {
        int f = 0;
        for (int i = 2; i <= num; ++i) {
            f = (target + f) % i;
        }
        return f;
    }
}
