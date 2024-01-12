package suanfa;

/**
 * ClassName: LCR120
 * Package: day24
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/11 19:34
 * @Version 1.0
 */
public class LCR120 {
    public int findRepeatDocument(int[] documents) {
        int[] ints = new int[documents.length];
        for (int document : documents) {
            if(ints[document] == 1){
                return document;
            }
            ints[document] = 1;
        }
return 0;
    }
}
