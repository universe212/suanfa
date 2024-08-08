package suanfa;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ClassName: LCR183
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/25 19:34
 * @Version 1.0
 */
public class LCR183 {

  public int[] maxAltitude(int[] heights, int limit) {


    if(heights.length == 0 || limit == 0) return new int[0];
    Deque<Integer> deque = new LinkedList<>();
    int[] res = new int[heights.length - limit + 1];//返回的数组大小
    for(int j = 0, i = 1 - limit; j < heights.length; i++, j++) {
    // 保持 deque 递减  移动前的清算
      while(!deque.isEmpty() && deque.peekLast() < heights[j])
        deque.removeLast();//维持一个单调递减得 单调栈  5 2  1
      deque.addLast(heights[j]);//相当于窗口滑动完成固定下来
      // 记录窗口最大值  移动完成
      if(i >= 0)
        res[i] = deque.peekFirst();

      if(i  >=  0 && deque.peekFirst() == heights[i]){
        deque.pollFirst();  //马上要移动了 移动前删除对应得
      }

    }
    return res;







//    if (heights.length == 0) {
//      return new int[0];
//    }
//
//    int h = heights.length;
//    PriorityQueue<Integer> result = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
//
//    ArrayList<Integer> res = new ArrayList<>();
//    int size = 1;
//    int left = 0;
//    int right = 0;
//    while (right < h) {
//      result.add(heights[right]);
//      if (size % limit == 0) {
//        res.add(result.peek());
//
//        // 修正错误：移除窗口左侧元素
//        if (heights[left] == result.peek()) {
//          result.poll();
//        }
//        else {
//          result.remove((heights[left]));
//        }
//        left++;
//        size--;
//
//      }
//      size++;
//      right++;
//    }
//
//    int[] ints = new int[res.size()];
//    for (int i = 0; i < res.size(); i++) {
//      ints[i] = res.get(i);
//    }
//    return ints;
  }

}
