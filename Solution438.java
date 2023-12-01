package suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: Solution438
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/18 19:27
 * @Version 1.0
 */
public class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int n1 = p.length();
        if(n < n1){
            return new ArrayList<Integer>();
        }
        char[] c1 = new char[26];
        char[] c2 = new char[26];
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < n1; i++){
            c1[s.charAt(i)-'a']++;
            c2[p.charAt(i)-'a']++;
        }
        if(Arrays.equals(c1,c2)){
            result.add(0);
        }
        for(int i = 0; i < n - n1;i++){  //n-n1表示移动到末尾还要多少次
            c1[s.charAt(i) - 'a']--;//这个是缩小窗口
            c1[s.charAt(i+n1) - 'a']++;//扩张窗口  总的来说是移动一个位置
            if(Arrays.equals(c1,c2)){
                result.add(i+1);
            }
        }
        return result;

        }

    public static void main(String[] args) {
        Solution438 ss = new Solution438();
        ss.findAnagrams("baa","aa");
    }

    }


