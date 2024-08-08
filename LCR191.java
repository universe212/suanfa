package suanfa;

/**
 * ClassName: LCR191
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/26 20:24
 * @Version 1.0
 */
public class LCR191 {
    public int[] statisticalResult(int[] arrayA) {
  int len = arrayA.length;
  if(len == 0) return new int[0];
  int[] b = new int[len];
  b[0] = 1;
  int temp = 1;
  for(int i = 1; i < len; i++){
      b[i] = arrayA[i-1] * b[i-1];//计算下三角形  b[i]在array[i]为1，就是其余乘积和
  }
for (int i = len - 2; i >= 0; i--){
    temp *= arrayA[i+1];
    b[i] *= temp;
}
return b;
    }
}
