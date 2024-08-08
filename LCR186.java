package suanfa;

import java.util.Arrays;

/**
 * ClassName: LCR186
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/26 19:09
 * @Version 1.0
 */
public class LCR186 {
    public boolean checkDynasty(int[] places) {
        int zero = 0;
        Arrays.sort(places);
        int bre = 0;
        for(int i = 0; i < 4; i++){
            if(places[i] == 0) zero++;
            else if(places[i] == places[i+1]) return false;
            else if(places[i] +1 != places[i+1]) bre += places[i+1] - places[i] - 1;
        }

        return zero >= bre;
    }
}
