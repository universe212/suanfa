package suanfa;

/**
 * ClassName: Solution151
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/20 20:21
 * @Version 1.0
 */
public class Solution151 {
    public String reverseWords(String s) {
        s = s.trim();
        int n = s.length() - 1;
        StringBuilder c = new StringBuilder();
        int l = n,r = n;
        while (l>=0){
            while (l >= 0 && s.charAt(l) != ' '){l--;}
            c.append(s.substring(l+1,r+1) + ' ');
            while (l >= 0 && s.charAt(l) == ' '){l--;}
            r = l;
        }
        return c.toString().trim();
    }

    public String reverseWords1(String s) {
        String[] s1 = s.trim().split(" ");
        StringBuilder c = new StringBuilder();
        for(int i = s1.length - 1; i >= 0;i--){
            if(s1[i].equals(' ')){continue;}
            c.append(s1[i] + " ");
            }
        return c.toString().trim();
        }

    }

