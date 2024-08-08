package suanfa;

/**
 * ClassName: LCR177
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/23 19:27
 * @Version 1.0
 */
public class LCR177 {
    public int[] sockCollocation(int[] sockets) {

//异或相同的为0 不同的为1 任何数字和0都是本身
        int x = 0, y = 0, n = 0, m = 1;
        for(int num : sockets)            // 1. 遍历异或
            n ^= num;
        // n是合成值
        while((n & m) == 0)
            m <<= 1;//
        //找出第一个 1 位置，这个1是两个数字其中一个特有得 不然相同就为0了
        for(int num: sockets) {           // 3. 遍历 sockets 分组
            if((num & m) != 0) x ^= num;  // 4. 根据那个特有特征把数组分成两组
            else y ^= num;
        }
        return new int[] {x, y};




//        int[] ints = new int[2];
//        HashMap<Integer, Boolean> result = new HashMap<>();
//        for (int socket : sockets) {
//            result.put(socket,!result.containsKey(socket));
//        }
//        int i = 0;
//        for (Map.Entry<Integer, Boolean> integerBooleanEntry : result.entrySet()) {
//            if(integerBooleanEntry.getValue() == true) ints[i++] = integerBooleanEntry.getKey();
//        }
//
//
//      return ints;
    }
}
