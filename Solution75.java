package suanfa;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * ClassName: Solution75
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/10 20:40
 * @Version 1.0
 */
public class Solution75 {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> result = new HashMap<>();
        LinkedList<Integer> objects = new LinkedList<>();
        for (int i = 0; i < nums.length; i++){
            result.put(nums[i], result.getOrDefault(nums[i],0)+1 );
        }
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            for(int i = 0; i < value; i++){
                objects.add(key);
            }
        }
        for (int i = 0; i < nums.length; i++){
            nums[i] = objects.pollFirst();
        }
    }
}
