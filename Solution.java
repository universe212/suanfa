package suanfa;

/**
 * ClassName: Solution
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/18 16:21
 * @Version 1.0
 * 赎罪信
 */
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n1 = ransomNote.length();
        int n2 = magazine.length();
        int[] ints = new int[26];
        for(int i = 0; i < n1; i++){
            ints[ransomNote.charAt(i) - 'a']++;
        }
        for(int i = 0; i < n2; i++){
            ints[magazine.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; i++){
            if(ints[i] > 0){
                return false;
            }
        }
        return  true;
    }
}
