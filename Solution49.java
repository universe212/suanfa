package suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * ClassName: Solution49
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/18 16:43
 * @Version 1.0
 */
public class Solution49 {

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(strs);
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList> cnt = new HashMap<>();//
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(!cnt.containsKey(key)){
                cnt.put(key,new ArrayList<>());
            }
            cnt.get(key).add(str);
        }
       return new ArrayList(cnt.values());
    }
}
