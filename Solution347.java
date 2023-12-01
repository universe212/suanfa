package suanfa;

import java.util.*;

/**
 * ClassName: Solution347
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/24 15:02
 * @Version 1.0
 */
public class Solution347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> cut = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];//升序
            }
        });//创建了一个队列这个队列存储{1,2} 坐标0是值，坐标1是该数字出现的次数
        for (int num : nums) {

                cut.put(num,cut.getOrDefault(num,0)+1);

        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : cut.entrySet()) {
            Integer value = integerIntegerEntry.getValue();//返回的出现次数
            Integer key = integerIntegerEntry.getKey();
            if(pq.size() == k){
                if(pq.peek()[1] < value){
                    pq.poll();
                    pq.offer(new int[]{key,value});
                }
            }
            else {pq.offer(new int[]{key,value});}
        }
        int[] cc = new int[k];
        for (int i = 0; i < k; i++) {
                 cc[i] = pq.poll()[0];
        }

return cc;
    }
    public int[] topKFrequent1(int[] nums, int k) {
        Map<Integer, Integer> occurrences = new HashMap<Integer, Integer>();
        for (int num : nums) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }
        // 获取每个数字出现次数
        List<int[]> values = new ArrayList<int[]>();
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            int num = entry.getKey(), count = entry.getValue();
            values.add(new int[]{num, count});
        }
        int[] ret = new int[k];
        qsort(values, 0, values.size() - 1, ret, 0, k);
        return ret;
    }

    public void qsort(List<int[]> values, int start, int end, int[] ret, int retIndex, int k) {
        int picked = (int) (Math.random() * (end - start + 1)) + start;
        Collections.swap(values, picked, start);

        int pivot = values.get(start)[1];//获取start脚标 出现次数的值此时start是刚刚交换了的
        int index = start;
        for (int i = start + 1; i <= end; i++) {
            // 使用双指针把不小于基准值的元素放到左边，
            // 小于基准值的元素放到右边
            if (values.get(i)[1] >= pivot) { //如果值大于start就交换把大的放左边吧
                Collections.swap(values, index + 1, i);
                index++;
            }
        }
        Collections.swap(values, start, index);

        if (k <= index - start) {
            // 前 k 大的值在左侧的子数组里
            qsort(values, start, index - 1, ret, retIndex, k);
        } else {
            // 前 k 大的值等于左侧的子数组全部元素
            // 加上右侧子数组中前 k - (index - start + 1) 大的值
            for (int i = start; i <= index; i++) {
                ret[retIndex++] = values.get(i)[0];
            }
            if (k > index - start + 1) {
                qsort(values, index + 1, end, ret, retIndex, k - (index - start + 1));
            }
        }
    }

}
