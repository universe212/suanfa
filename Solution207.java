package suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Solution207
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/2 20:04
 * @Version 1.0
 */
public class Solution207 {
    List<List<Integer>> edges; //创建一个{{1,2} {2,3}} 学1之前必须先学2
    int[] visited;//
    boolean valid = true;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        edges = new ArrayList<List<Integer>>();
        for (int i = 0; i < numCourses - 1; i++) {
            edges.add(new ArrayList<Integer>());
        }
        for (int[] prerequisite : prerequisites) {
            //{ A ,B }学A之前先学B
            edges.get(prerequisite[1]).add(prerequisite[0]);
            //给B的角标加上A  在图中表示 B->A  遍历从B走到A能走通A入栈
        }
        for (int i = 0; i < numCourses && valid; i++) {
            if(visited[i] == 0){
                dfs(i);
            }
        }
return valid;
    }

    public void dfs(int u) {
          visited[u] = 1;
        for (int v : edges.get(u)) {
            if(visited[v] == 0){
                dfs(v);
                if(!valid){
                    return;
                }
            }
            else if(visited[v] == 1){
                return;
            }
        }
        visited[u] = 2;

    }
//谨记  A->B->C 在图中表示到C要经历ABC  所以 ListA 保存了 B   (B,A)
    // A->B->A   不管(A,B) 表示B学了才能学A 看图就行  B->A
}
