package suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Solution763
 * Package: suanfa
 * Description
 * 2
 * @Author HuanZ
 * @Create 2023/11/14 18:44
 * @Version 1.0
 */
public class Solution763 {
    public List<Integer> partitionLabels(String s) {
        List<Integer> arr = new ArrayList<>();
        int l = s.length();
        int[] last = new int[26];
        for(int i = 0;i < l;i++){
             last[s.charAt(i) - 'a'] = i;//把对应字母位置 变成i就是最后出现的位置
         }
        int end = 0;
        int start = 0;
        for(int i = 0; i < l;i++){
            end = Math.max(end,last[s.charAt(i) - 'a']);
            if(end == i){
                arr.add(end + 1 - start);
                start = end + 1;
            }
        }
        return arr;
    }
}
