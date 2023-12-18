package suanfa;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * ClassName: Solution797
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/8 19:36
 * @Version 1.0
 */
public class Solution797 {
       List<List<Integer>>  ans = new ArrayList<List<Integer>>();
       Deque<Integer> stack = new ArrayDeque<Integer>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
       stack.offerLast(0);
       dfs(graph,0,graph.length - 1);
       return ans;
    }

    private void dfs(int[][] graph, int node, int i) {
        if(node == i){
            ans.add(new ArrayList<Integer>(stack));
        }
        for (int i1 : graph[0]) {
            stack.offerLast(i1);
            dfs(graph,i1,i);
            stack.pollLast();
        }

    }


}
