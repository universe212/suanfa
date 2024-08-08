package suanfa;

import java.util.LinkedList;

/**
 * ClassName: Solution394
 * Package: suanfa
 * Description
 * 2
 * @Author HuanZ
 * @Create 2024/1/5 20:31
 * @Version 1.0
 */
public class Solution394 {
    public String decodeString(String s) {
        StringBuilder  res = new StringBuilder();//
        int multi = 0;
        LinkedList<Integer> stack_multi = new LinkedList<>();
        LinkedList<String> stack_res = new LinkedList<>();
        for (Character c : s.toCharArray()) {
            if(c == '['){
                stack_multi.addLast(multi); //当出现这个把 res拿出来清空
                stack_res.addLast(res.toString());// 数字也拿起来清空 这里细节是 res是字符串加进去的
                res = new StringBuilder();
                multi = 0;
            }
            else if(c == ']'){
                StringBuilder  cns = new StringBuilder();
                int cur_muti = stack_multi.removeLast(); //取出最近的数字就是倍数
                for(int i = 0; i < cur_muti; i++){ //而此时的res 就是 []里面的 因为出现[会清空res
                    cns.append(res);//把最近的那个拿出来 相乘
                }//[a[abc]]
                res = new StringBuilder(stack_res.removeLast() + cns); //此时弹出来的是字符串 + cns存储在临时 等待下一次[
            }
            else if(c >= '0' && c <= '9') multi = multi * 10 + Integer.parseInt(c + "");//毕竟是字符串防止出现 几十几百 c-'0'也可以
            else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
