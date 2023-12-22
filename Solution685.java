package suanfa;

/**
 * ClassName: Solution685
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/18 19:25
 * @Version 1.0
 */
public class Solution685 {
    public int[] findRedundantDirectedConnection(int[][] edges) {
        int n = edges.length;//假设长度为2，1，2
        UnionFind uf = new UnionFind(n + 1);//这个找成环得类似684 ，如果这边取2 初始化就是 0 1所以n+1
        int[] parent = new int[n + 1];//因为是从1开始所以 n+1 parent找入度为2得
        for(int i = 1; i < n + 1; i++){
            parent[i] = i; //初始化
        }
        int conflict = -1;//冲突判断
        int cycle = -1;//环判断  两个判断不冲突得
        for (int i = 0; i < n; i++) {
            int[] edge = edges[i];
            int node1 = edge[0];
            int node2 = edge[1];
            if(parent[node2] != node2){
                conflict = i; //冲突优先级最大  找到入度为2点
            }
            else {
                parent[node2] = node1;//没找到 把 Node1指向Node2
                if(uf.find(node1) == uf.find(node2)){
                    cycle = i; //查看是不是同一个祖先是就是说明是环
                    //可能会疑惑俄国 1，2  1，3 当1.3进来 此时 3得祖先才设置为1判断得适合没设置
                }
                else {
                    uf.union(node1,node2);//不是就联合两个 把 Node得祖先变成Node1得祖先
                }
            }
        }
        if(conflict < 0){
            int[] redundant = {edges[cycle][0],edges[cycle][1]};
            return redundant;  //只有环切环
        }
        else {
            int[] conflictEdge = edges[conflict];
            if(cycle >= 0){
                int[] redundant = {parent[conflictEdge[1]],conflictEdge[1]};
                return redundant;//有入度为2 切有环 此时 他既然冲突了环肯定不是这个边 找 入度为2得祖先
            }
            else {
                int[] redundant = {conflictEdge[0],conflictEdge[1]};
                return redundant;//只有入度为2 直接切割冲突边
            }
        }

    }
}

    class UnionFind {
        int[] ancestor;

        public UnionFind(int n) {
            ancestor = new int[n];
            for (int i = 0; i < n; i++) {
                ancestor[i] = i;
            }
        }

        public void union(int index1,int index2)
        {
          ancestor[find(index2)] = find(index1); //把他的根给他 根就完事了
        }

        public int find(int index){
            if(ancestor[index] != index){
                ancestor[index] = find(ancestor[index]);//寻根记
            }
            return ancestor[index];
        }
    }





