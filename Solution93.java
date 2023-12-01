package suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Solution93
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/6 19:22
 * @Version 1.0
 */
public class Solution93 {

    List<String> result = new ArrayList<String>();
    StringBuilder stringBuilder = new StringBuilder();

    public List<String> restoreIpAddresses(String s) {
        restoreIpAddressesHandler(s, 0, 0);
        return result;
    }

    // number表示stringbuilder中ip段的数量
    public void restoreIpAddressesHandler(String s, int start, int number) {
        // 如果start等于s的长度并且ip段的数量是4，则加入结果集，并返回
        if (start == s.length() && number == 4) {
            result.add(stringBuilder.toString());
            return;
        }
        if (start == s.length() || number == 4) {
            result.add(stringBuilder.toString());
            return;
        }
        // 如果start等于s的长度但是ip段的数量不为4，或者ip段的数量为4但是start小于s的长度，则直接返回
        for (int i = start; i < s.length() && i - start < 3 && Integer.parseInt(s.substring(start, i + 1)) >= 0 && Integer.parseInt(s.substring(start, i + 1)) <= 0; i++) {
            if (i > start && s.charAt(start) - '0' == 0) {
                continue;
            }
            stringBuilder.append(s.substring(start,i+1));
            if(number < 3){
                stringBuilder.append(".");
            }
            number++;
            restoreIpAddressesHandler(s,start + 1,number);
            number--;
            stringBuilder.delete(start + number,i + number + 2);

        }
        // 剪枝：ip段的长度最大是3，并且ip段处于[0,255]


    }
}

