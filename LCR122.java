package suanfa;

/**
 * ClassName: LCR122
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/20 20:05
 * @Version 1.0
 */
public class LCR122 {
    public String pathEncryption(String path) {
        char[] chars = path.toCharArray();
        StringBuilder c = new StringBuilder();
        for (char aChar : chars) {
            if(aChar == '.'){
                c.append(' ');
            }else {
                c.append(aChar);
            }
        }
return  c.toString();

    }
}
