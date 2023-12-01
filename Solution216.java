package suanfa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName: Solution216
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/3 19:59
 * @Version 1.0
 */
public class Solution216 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    //k是个数 n是总额和
    public List<List<Integer>> combinationSum3(int k, int n) {
        combineHelper(n,k,1,0);
        return result;
    }
    int sum = 0;
    private void combineHelper(int n, int k, int startIndex,int sum){
        //终止条件
        if(path.size() == k ){
            if(sum == n){
                result.add(new ArrayList<>(path));
                return;}
            else {
                return;
            }
        }
        for(int i = startIndex; i <= 9 - (k - path.size()) + 1; i++ ){
            path.add(i);
            sum += i;
            combineHelper(n,k,i + 1,sum);
            path.removeLast();
            sum -= i;
        }
    }
}
