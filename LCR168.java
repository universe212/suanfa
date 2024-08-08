package suanfa;

/**
 * ClassName: LCR168
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/21 21:07
 * @Version 1.0
 */
public class LCR168 {
    public int nthUglyNumber(int n) {
        //nums2 = {1*2, 2*2, 3*2, 4*2, 5*2, 6*2, 8*2...}
        //nums3 = {1*3, 2*3, 3*3, 4*3, 5*3, 6*3, 8*3...}
        //nums5 = {1*5, 2*5, 3*5, 4*5, 5*5, 6*5, 8*5...}
       //相当于把这个三个数组合并 把最小的依次放入cnt 遇到相同的最小 两个一起跳一步
        int a = 0,b = 0, c = 0;
        int[] cnt = new int[n];
        cnt[0] = 1;
        for(int i = 1; i < n; i++){
            int n1 = cnt[a]*2;
            int n2 = cnt[b]*3;
            int n3 = cnt[c]*5;
            cnt[i] = Math.min((Math.min(n1,n2)),n3);
            if(cnt[i] == n1) a++;
            if(cnt[i] == n2) b++;
            if(cnt[i] == n3) c++;
        }
        return cnt[n-1];
    }
}
