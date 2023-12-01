package suanfa;

import java.util.Arrays;

/**
 * ClassName: Solution455
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/8 16:54
 * @Version 1.0
 */
public class Solution455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int max = 0;
        for(int i = 0 ,j = 0; i < s.length&& j< g.length; i++){
            if(s[i] < g[j]){

            }else{
                j++;
                max++;
            }
        }
        return max;
    }
}
