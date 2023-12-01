package suanfa;

/**
 * ClassName: Solution134
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/13 16:20
 * @Version 1.0
 */
public class Solution134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
      int curSum = 0;
      int totalSum = 0;
      int index = 0;
      int l = gas.length;
      for(int i = 0; i < l; i++){
          curSum += gas[i] - cost[i];
          totalSum += gas[i] - cost[i];
          if(curSum < 0){
              curSum = 0;
              index = i + 1;
          }
      }
      if(totalSum < 0){
          return  -1;
      }
      return index;
    }
}
