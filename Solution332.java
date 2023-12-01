package suanfa;

import java.util.*;

/**
 * ClassName: Solution332
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/7 19:45
 * @Version 1.0
 */
public class Solution332 {

      HashMap<String,PriorityQueue<String>> path = new HashMap<>();
        List<String> result = new LinkedList<String>();
    public List<String> findItinerary(List<List<String>> tickets) {
        for (List<String> ticket : tickets) {
            String s = ticket.get(0);
            String s1 = ticket.get(1);
            if(!path.containsKey(s)){
                path.put(s,new PriorityQueue<>());
            }
            path.get(s).offer(s1);
        }
        dfs("JFK");
        return result;

    }

    public void dfs(String curr) {
     while ( path.containsKey(curr) && path.get(curr).size() > 0){
         path.get(curr).poll();
         dfs(curr);
     }
     result.add(curr);
    }
}
