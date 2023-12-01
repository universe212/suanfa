package suanfa;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * ClassName: Solution406
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/13 20:19
 * @Version 1.0
 */
public class Solution406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b) -> {
            if(a[0] == b[0]) return a[1] -b[1];
            return b[0] - a[0];
        });
        LinkedList<int[]> objects = new LinkedList<>();
        for (int[] person : people) {
            objects.add(person[1],person);
        }
        return objects.toArray(new int[people.length][]);

    }
}
