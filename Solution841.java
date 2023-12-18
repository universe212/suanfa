package suanfa;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * ClassName: Solution841
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/14 20:24
 * @Version 1.0
 */
public class Solution841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> queue = new LinkedList<>();
        queue.addAll(rooms.get(0));
        HashSet<Integer> hashSet = new HashSet<>();
        int size1 = rooms.size();
        int[] ints = new int[size1];
        ints[0] = 1;
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size>0){
                Integer poll = queue.poll();
                if(!hashSet.contains(poll) && ints[poll]==0){
                    ints[poll] = 1;
                    hashSet.add(poll);
                    queue.addAll(rooms.get(poll));
                }
                size--;
            }

        }
        for (int anInt : ints) {
            if(!(anInt==1)){
                return false;
            }
        }
return true;
    }
}
