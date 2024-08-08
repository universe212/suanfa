package suanfa;

/**
 * ClassName: LCR173
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/22 20:37
 * @Version 1.0
 */
public class LCR173 {
    public int takeAttendance(int[] records) {
        int l = 0;
        int r = records.length - 1;
        while (l <= r){
            int mid = (l + r + 1)/2;
            if(records[mid] == mid) l = mid + 1;
            else r =  mid - 1;
        }
        return l;
    }
}
