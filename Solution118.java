package suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Solution118
 * Package: suanfa
 * Description
 * 2
 * @Author HuanZ
 * @Create 2024/1/9 20:04
 * @Version 1.0
 */
public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            ArrayList<Integer> res = new ArrayList<>();
            for(int j = 0; j <= i; j++){ //这里注意一下 i取到第二行实际值是1所以是等于
                if(j == 0 || j == i){
                    res.add(1);
                }
                else {
                    res.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }
            }
            result.add(res);
        }
        return result;
    }
}
