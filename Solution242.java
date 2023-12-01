package suanfa;

/**
 * ClassName: Solution242
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/18 15:58
 * @Version 1.0
 */
public class Solution242 {
    public boolean isAnagram(String s, String t) {
     if(s.length() != t.length()){
         return false;
     }
        int[] ints = new int[26];
     for(int i = 0; i < s.length(); i++){
         ints[s.charAt(i) - 'a']++;
         ints[t.charAt(i) - 'a']--;
     }
     for(int i = 0; i < 26; i++){
         if(ints[i] != 0){
             return false;
         }
     }
     return  true;
    }
}
