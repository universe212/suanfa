package suanfa;

/**
 * ClassName: Solution509
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/27 16:17
 * @Version 1.0
 */
public class Solution509 {
    public int fib(int n) {
        if(n == 0){
            return 0;
        }
        int[] ints = new int[n+1];
        ints[1] = 1;
        for(int i = 2; i <= n; i++ )
        {ints[i] = ints[i-1] + ints[i-2];

        }
        return ints[n];
    }


    }

