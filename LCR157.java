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
// used[i - 1] 为false 要求是不能含有重复元素
        for (int i = 0; i < goodsArray.length; i++) {
            if (i > 0 && goodsArray[i] == goodsArray[i - 1] &&  !used[i - 1]) {
                continue;  //保证用了第一个a才会用第二个a
                // a a b
                //假如 第一次 用的时 第二个a 那么下一次进入循环就会用第一个a 就重复了
                //因为 dfs里面的for每次从 i=0开始，所以只有前面哪个用了才可以
                //相当于 for 第一层用的第二个a 那么for 第二层 用第一个a
                // 就会与for 第一层用第一个a for 第二层用第二个a重复
            }

            //eg: abbc
            //当填写 以ab开头的可能之后 然后 used[3]去填 第二个位置的时候，因为 之前used[2]和他相同情况已经完了
            //所以跳过  不然会 再来一边以第二个位置为b的可能

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
