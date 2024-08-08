package suanfa;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: LCR178
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/23 20:07
 * @Version 1.0
 */
public class LCR178 {
    public int trainingPlan(int[] actions) {

        HashMap<Integer, Boolean> result = new HashMap<>();
        for (int socket : actions) {
            result.put(socket,!result.containsKey(socket));
        }
        int i = 0;
        for (Map.Entry<Integer, Boolean> integerBooleanEntry : result.entrySet()) {
            if(integerBooleanEntry.getValue() == true) return integerBooleanEntry.getKey();
        }


      return 0;

    }
}
