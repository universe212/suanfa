package suanfa;

/**
 * ClassName: Solution684
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/15 20:20
 * @Version 1.0
 */
public class Solution684 {
    public int[] findRedundantConnection(int[][] edges) {
        int length = edges.length;
        int[] parent = new int[length + 1];
        for (int i = 0; i < parent.length; i++){
            parent[i] = i;
        }
        for(int i = 0; i < length; i++){
            int[] edge = edges[i];
             int node1 = edge[0];
             int node2 = edge[1];
            if(find(parent,node1) != find(parent,node2)){
                //比较根节点相等不 不相等就找他们根节点
                union(parent,node1,node2);
            }
            else {
                return edge; //相等说明是相同根直接删除返回
            }
        }
           return new int[0];//返回0 就是不需要
    }

    private void union(int[] parent, int node1, int node2) {
        parent[find(parent,node1)] = parent[find(parent,node2)];
    }

    private int find(int[] parent, int index) {
        if(parent[index] != index){
            parent[index] = find(parent,parent[index]);
        }
        return parent[index];
    }
}
