package suanfa;

import java.util.HashMap;

/**
 * ClassName: Solution560
 * Package: suanfa
 * Description
 *2
 * @Author HuanZ
 * @Create 2023/12/21 19:19
 * @Version 1.0
 */
public class Solution560 {
    public int subarraySum(int[] nums, int k) {
      int count  = 0;
      int pre = 0;
        HashMap<Integer ,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0; i < nums.length ;i++){
            pre += nums[i]; 
            if(map.containsKey(pre-k)){
                count += map.get(pre-k);
            }
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
return count;

    }
}
