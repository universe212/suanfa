package suanfa;

/**
 * ClassName: Solution76
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/12 17:01
 * @Version 1.0
 */
    public class Solution76 {
    public String minWindow(String s, String t) {
        if (s == null || s.length() == 0 || t == null || t.length() == 0) {
            return "";
        }
        //定义维护变量:最小窗口和窗口需要的t字符数(初始长度即t的长度)以及最小覆盖串开始的index,还有数组(充当计数哈希表) 注意need cnt这个计数变量 避免了通过循环去判断窗口是否包含了t所有元素
        int minWindow = Integer.MAX_VALUE, needcnt = t.length(), startIndex = 0;
        int[] need = new int[128]; //128是ASCII码位数  need中需要的字符为非负 不需要的字符为负值(不需要的可分为非t字符串字符 还有t字符串字符的多余字符,比如ABC 但是有两个A 那么前面那个A就是不需要的字符)
        //构建字符串t的计数数组
        for (int i = 0; i < t.length(); i++) {
            need[t.charAt(i)]++;  //t的每一个标记在need里面做标记
        }
        //定义窗口首尾端口,滑动窗口 滑动窗口大小=end-start+1
        int start = 0;
        for (int end = 0; end < s.length(); end++) {  //for循环移动end指针
            //
            if (need[s.charAt(end)] > 0) {
                needcnt--;  //表示s出现的字母在 need已经标记说明含有一个了
            }
            need[s.charAt(end)]--;    //加入了一个字符到窗口中 那么需要的这个字符数就-1
            if (needcnt == 0) {                      //第一步: 不断增加j使滑动窗口增大，直到窗口包含了T的所有元素
                while (need[s.charAt(start)]< 0) {   //第二步: 删掉所有前面不需要的字符
                    need[s.charAt(start)]++;         //前移start前释放掉字符 窗口释放了那么需要的字符数就+1
                    start++;
                }
                //删掉所有前面的非t元素，记录此时滑动窗口的长度，并保存最小值
                if (end - start + 1 < minWindow) {
                    minWindow = end - start + 1;
                    startIndex = start;              //记录下最小值时候的开始位置，最后返回覆盖串时候会用到, 开始位置加上窗口的长度就等于结束位置了
                }
                //第三步:让i再增加一个位置（舍弃掉必须包含的字符），这个时候滑动窗口肯定不满足条件了，那么继续从步骤一开始执行（找到舍弃掉的那个必须包含的字符）
                need[s.charAt(start)]++;         //前移start前释放掉字符 窗口释放了那么需要的字符数就+1
                start++;
                //舍弃了必须包含的字符 窗口需要的t字符++
                needcnt++;
            }
        }
        return minWindow == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minWindow);
    }
}
