package suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Solution17
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/3 20:22
 * @Version 1.0
 */
public class Solution17 {
    //设置全局列表存储最后的结果
    List<String>  result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0){
            return result;
        }
    String[] numString =  {"", " ","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backTracking(digits,numString,0);
        return result;
    }
    StringBuilder temp = new StringBuilder();
    private void backTracking(String digits, String[] numString, int num) {
        if(num == digits.length()){
           result.add(temp.toString());
           return;
        }
        String str = numString[digits.charAt(num) - '0'];
        for(int i = 0; i < str.length(); i++){
            temp.append(str.charAt(i));
            backTracking(digits,numString,num + 1);
            temp.deleteCharAt(temp.length() - 1);//删除最好一个字母
        }
    }

}
