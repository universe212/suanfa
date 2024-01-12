package suanfa;

/**
 * ClassName: LCR128
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/11 20:52
 * @Version 1.0
 */
public class LCR128 {
    public int stockManagement(int[] stock) {
int min = Integer.MIN_VALUE;
        for (int i : stock) {
            min = Math.min(i,min);
        }
return min;
    }
}
