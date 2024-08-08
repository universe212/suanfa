package suanfa;

/**
 * ClassName: Solution208
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/2/23 20:05
 * @Version 1.0
 */
public class Solution208 {
}
class Trie {
    private  Trie[] children;
    private boolean isEnd;
    public Trie() {
        //内部熟悉
     children = new Trie[26];
     isEnd = false;
    }

    public void insert(String word) {
      Trie node = this;
      for(int i = 0; i < word.length(); i++){
          char ch = word.charAt(i);
          int index = ch - 'a';//索引
          if(node.children[index] == null){
              node.children[index] = new Trie();
          }
          node = node.children[index];//向下移动
      }
      node.isEnd = true;
    }

    public boolean search(String word) {
        Trie node = searchPrefix(word);
        return node != null && node.isEnd;
    }

    public boolean startsWith(String prefix) {
          return searchPrefix(prefix) != null;
    }
    private Trie searchPrefix(String prefix) {
        Trie node = this;
        for(int i = 0; i < prefix.length(); i++){
            char ch = prefix.charAt(i);
            int index = ch - 'a';
            if(node.children[index] == null){
                return null;
            }
            node = node.children[index];
        }
        return node;
    }
}