package suanfa;

import java.util.*;

/**
 * ClassName: Solution127
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/13 20:15
 * @Version 1.0
 */
public class Solution127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> wordSet = new HashSet<>(wordList);
        if(wordSet.size() == 0 || !wordSet.contains(endWord)){
            return 0;
        }
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        HashMap<String, Integer> map = new HashMap<>();//记录对应单词和路线大小
        map.put(beginWord,1);
        while (!queue.isEmpty()){
            String word = queue.poll();
            int path = map.get(word);
            for(int i = 0; i < word.length(); i++){
                char[] chars = word.toCharArray();
                for(char k = 'a'; k <= 'z'; k++){
                    chars[i] = k;
                    String s = String.valueOf(chars);//转换成字符串
                    if(s.equals(endWord)){
                        return path + 1;
                    }
                    if(wordSet.contains(s) && !map.containsKey(s)){
                        map.put(s,path+1);
                        queue.offer(s);
                    }
                }
            }

        }
         return 0;
    }
}
