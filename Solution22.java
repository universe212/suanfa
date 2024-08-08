package suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Solution22
 * Package: suanfa
 * Description
 *  2
 * @Author HuanZ
 * @Create 2024/1/3 20:05
 * @Version 1.0
 */
public class Solution22 {
    List<String> ans = new ArrayList<String>();
    StringBuilder cur;
    public List<String> generateParenthesis(int n) {

        //传入 输出的
        backtrack(new StringBuilder(), 0, 0, n);
        return ans;
    }

    public void backtrack(StringBuilder cur, int open, int close, int max) {
        if(cur.length() == max*2){
            ans.add(cur.toString());
            return;
        }
        if(open < max){ //先添加的'('先把(添加满了 回溯 eg n=3 ((( )))  (() () (
            cur.append('(');
            backtrack(cur,open+1,close,max);
            cur.deleteCharAt(cur.length() - 1);
        }
        if(close < open){  //close 小于open  保证了  (( ))) 这个情
            cur.append(')');
            backtrack(cur,open,close + 1,max);
            cur.deleteCharAt(cur.length() - 1);
        }

    }

}
