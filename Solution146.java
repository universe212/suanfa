package suanfa;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * ClassName: Solution146
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/2/15 20:29
 * @Version 1.0
 */
public class Solution146 {

}
class LRUCache1 extends LinkedHashMap<Integer,Integer> {
    private int capacity;
    public LRUCache1(int capacity) {
     super(capacity,0.75F,true);
     this.capacity = capacity;
    }

    public int get(int key) {
     return super.getOrDefault(key,-1);//不存在返回-1 存在方法移动到末尾
    //详情看源码
    }

    public void put(int key, int value) {
        super.put(key,value);//计算哈希位置 插入末尾
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}
