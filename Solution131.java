package suanfa;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName: Solution131
 * Package: suanfa
 * Description
 * 2
 * @Author HuanZ
 * @Create 2023/11/6 16:12
 * @Version 1.0
 */
public class Solution131 {
   Deque<String> path = new LinkedList<>();//字符串
    List<List<String>> result =  new LinkedList<>(); //结果
    public List<List<String>> partition(String s) {
        dfs(s,0);
        return result;
    }

    private void dfs(String s, int startIndex) {

        if(startIndex >= s.length()){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i = startIndex; i < s.length(); i++){
            if(isPalindrome(s,startIndex,i)){//判断是不是回文，是就加
                String s1 = s.substring(startIndex, i + 1);//如果是回文加进去  还可判断剩余是不是回文
                path.add(s1);
            }
            else {
                continue;
            }
            //  a b c d 后面 a b (cd) 后面 (a) (bc) d
            dfs(s,i+1);//只有满足是回文的情况下才会 继续探究否则continue
            path.removeLast();
        }
    }

    private boolean isPalindrome(String s, int startIndex, int end) {

        for(int i = startIndex, j =end ; i < j; i++,j--){
            if(!(s.charAt(i) == s.charAt(j))){
                return false;
            }
        }
        return true;
    }
}
