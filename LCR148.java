package suanfa;

import java.util.Stack;

/**
 * ClassName: LCR148
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/16 19:23
 * @Version 1.0
 */
public class LCR148 {
    public boolean validateBookSequences(int[] putIn, int[] takeOut) {
        Stack<Integer> stack1 = new Stack<>();

        // 将 takeOut 数组倒序压入 stack2

int j = 0;
        // 逐个处理 putIn 数组元素
        for (int i = 0; i < putIn.length; i++) {
            stack1.push(putIn[i]);

            // 检查是否可以匹配
            while (!stack1.isEmpty() && stack1.peek() == takeOut[j]) {
                stack1.pop();
               j++;
            }
        }

        // 检查最终栈是否为空，确保所有元素都匹配
        return stack1.isEmpty();

    }
}
