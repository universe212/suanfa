package suanfa;

import java.util.HashMap;

/**
 * ClassName: LCR169
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/22 19:15
 * @Version 1.0
 */
public class LCR169 {
    public char dismantlingAction(String arr) {
        HashMap<Character, Boolean> result = new HashMap<>();
        for (char c : arr.toCharArray()) {
            result.put(c,!result.containsKey(c));//没包含 true 包含了第二次变false
        }
        for (char c : arr.toCharArray()) {
            if(result.get(c)) return c;
        }


        return ' ';


//        int[] arr = new int[26];
//        char[] chars = s.toCharArray();
//        for (char ch : chars){
//            arr[ch -'a'] ++;
//        }
//        for (char c:chars){
//            if (arr[c-'a'] == 1){
//                return c;
//            }
//        }
//        return ' ';
    }
}
