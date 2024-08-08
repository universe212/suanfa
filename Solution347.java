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
        PriorityQueue<int[]> result = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int num : nums) {
            hashmap.put(num, hashmap.getOrDefault(num,0)+1);
        }

        for (Map.Entry<Integer, Integer> num : hashmap.entrySet()) {
            Integer key = num.getKey();
            Integer value = num.getValue();
            result.offer(new int[]{key,value});
        }
        int[] ints = new int[k];
        for (int i = 0; i < k; i++) {
            ints[i] = result.poll()[0];
        }
        return ints;
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
