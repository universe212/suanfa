package suanfa;

/**
 * ClassName: LCR179
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/23 20:20
 * @Version 1.0
 */
public class LCR179 {
    public int[] twoSum(int[] price, int target) {


        int[] res = new int[2];
        for (int i = 0, j = price.length-1; i < j;) {
            if (price[i]+price[j]==target){
                res[0] = price[i];
                res[1] = price[j];
                return res;
            }else if (price[i]+price[j]>target){
                j--;
            }else {
                i++;
            }
        }
        return res;






//        Boolean[] dp = new Boolean[target + 1];
//        for(int i = 1; i < target +  1; i++){
//            dp[i] = false;
//        }
//        dp[0] = true;
//        int[] ints = new int[2];
//        for(int i = 0; i < price.length;i++){
//            if(price[i] <= target){
//                dp[price[i]] = true;
//                if(dp[target - price[i]] == true){
//                    ints[0] = price[i];
//                    ints[1] = target - price[i];
//                }
//            }
//
//        }
//        return ints;
    }
}
