package suanfa;

/**
 * ClassName: Solution860
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/13 19:29
 * @Version 1.0
 */
public class Solution860 {
    public boolean lemonadeChange(int[] bills) {
        int l = bills.length;
        int q = 0;
        int o = 0;
      for(int i = 0; i < l; i++){
          if(bills[i] == 5){
              q++;
          }
          else if(bills[i] == 10){
                   q--;
                   o++;
          }
          else if(bills[i] == 20){
              if(o > 0){
                  o--;
                  q--;
              }
              else {
                  q -= 3;
              }
          }
          if(q < 0 || o < 0){
              return false;
          }
      }
      return true;
    }
}
