package suanfa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName: Solution77
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/3 17:06
 * @Version 1.0
 */
public class Solution77 {
   List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer>path = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        combineHelper(n,k,1);
        return result;
    }

    /**
     * 每次从集合中选取元素，可选择的范围随着选择的进行而收缩，调整可选择的范围，就是要靠startIndex
     * @param startIndex 用来记录本层递归的中，集合从哪里开始遍历（集合就是[1,...,n] ）。
     */
    private void combineHelper(int n, int k, int startIndex){
        //终止条件
        if(path.size() == k){
        result.add(new ArrayList<>(path));
        return;}
        for(int i = startIndex; i <= (n - (k - path.size()) + 1); i++ ){
            path.add(startIndex);
            combineHelper(n,k,i + 1);
            path.removeLast();
        }
    }
}
