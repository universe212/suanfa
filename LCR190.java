package suanfa;

/**
 * ClassName: LCR190
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/26 20:10
 * @Version 1.0
 */
public class LCR190 {
    public int encryptionCalculate(int dataA, int dataB) {
        while(dataB != 0) { // 当进位为 0 时跳出
            int c = (dataA & dataB) << 1;  // c = 进位
            dataA ^= dataB; // dataA = 非进位和
            dataB = c; // dataB = 进位
        }
        return dataA;

    }
}
