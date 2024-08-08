package suanfa;

/**
 * ClassName: LCR189
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/26 19:58
 * @Version 1.0
 */
public class LCR189 {
    public int mechanicalAccumulator(int target) {
        //&& 前面为false就不会执行后面
        return target == 0 ? 0: target + mechanicalAccumulator(target-1);
    }
}
