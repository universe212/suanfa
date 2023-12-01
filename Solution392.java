package suanfa;

/**
 * ClassName: Solution392
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/23 18:23
 * @Version 1.0
 */
public class Solution392 {
    public boolean isSubsequence(String s, String t) {
        int[] dp = new int[s.length()];
        int y = 0;
        for(int i = 0; i < s.length();i++){
            for(int j = y; j < t.length();j++){
               if(s.charAt(i) == t.charAt(j)){
                   y = j + 1;
                   dp[i] = 1;
                   break;
               }
            }
        }
        for (int i : dp) {
            System.out.println(i);
            if(i != 1){
                return false;
            }
        }
return true;

    }
}
