package suanfa;

/**
 * ClassName: LCR121
 * Package: suanfa
 * Description
 * 2
 * @Author HuanZ
 * @Create 2024/1/11 19:41
 * @Version 1.0
 */
public class LCR121 {
    public boolean findTargetIn2DPlants(int[][] plants, int target) {
       int l = plants.length;
       int l2 = plants[0].length;
       int x = 0;
       int y = l2 - 1;
       while (x < l && y >= 0){
           if(plants[x][y] == target){
               return true;
           }
           else if(plants[x][y] > target){
               y--; //从第一行 最后一个值开始查找，如果大于则 y--  这旋转后是一个搜索二叉树 抽象BTS
           }
           else {
               x++;
           }
       }
       return false;
    }
}
