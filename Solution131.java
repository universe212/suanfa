package suanfa;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName: Solution131
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/6 16:12
 * @Version 1.0
 */
public class Solution131 {
   Deque<String> path = new LinkedList<>();
    List<List<String>> result =  new LinkedList<>();
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
            if(isPalindrome(s,startIndex,i)){
                String s1 = s.substring(startIndex, i + 1);
                path.add(s1);
            }
            else {
                continue;
            }
            dfs(s,startIndex+1);
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
