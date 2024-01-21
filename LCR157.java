package suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: LCR157
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/19 19:45
 * @Version 1.0
 */
public class LCR157 {

    // 存放结果
    List<String> result = new ArrayList<>();
    // 暂存结果
    StringBuilder path = new StringBuilder();

    public String[] goodsOrder(String goods) {
        char[] goodsArray = goods.toCharArray();
        Arrays.sort(goodsArray);
        boolean[] used = new boolean[goodsArray.length];
        Arrays.fill(used, false);
        backTrack(goodsArray, used);
        return result.toArray(new String[0]);
    }

    private void backTrack(char[] goodsArray, boolean[] used) {
        if (path.length() == goodsArray.length) {
            result.add(path.toString());
            return;
        }

        for (int i = 0; i < goodsArray.length; i++) {
            if (i > 0 && goodsArray[i] == goodsArray[i - 1] && !used[i - 1]) {
                continue;
            }

            if (!used[i]) {
                used[i] = true;
                path.append(goodsArray[i]);
                backTrack(goodsArray, used);
                path.deleteCharAt(path.length() - 1);
                used[i] = false;
            }
        }
    }
}
