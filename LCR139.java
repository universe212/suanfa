package suanfa;

/**
 * ClassName: LCR139
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/15 20:01
 * @Version 1.0
 */
public class LCR139 {
    public int[] trainingPlan(int[] actions) {
        int i = 0;
        int length = actions.length;
        int j = length - 1;
        int tmp = 0;
        while (i < j){
            while(i < j && (actions[i] % 2) == 1) i++;
            while(i < j && (actions[j] % 2) == 0) j--;
            tmp = actions[i];
            actions[i] = actions[j];
            actions[j] = tmp;
        }
        return actions;

    }

}
