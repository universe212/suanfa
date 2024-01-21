package suanfa;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ClassName: LCR159
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/19 20:22
 * @Version 1.0
 */
public class LCR159 {
    public int[] inventoryManagement(int[] stock, int cnt) {
        Arrays.sort(stock);
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < cnt; i++){
            result.add(stock[i]);
        }
        int[] ints = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            ints[i] = result.get(i);
        }
        return ints;
    }
}
