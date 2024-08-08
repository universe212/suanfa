package suanfa;

/**
 * ClassName: LCR132
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/8/1 14:08
 * @Version 1.0
 */
public class LCR132 {
    public int cuttingBamboo(int n) {
// 1、所有绳子的长度相等时，乘积最大
        // 2、最优绳长为3，先按3分段，即n=3*a+b,则b=0,1,2.
        //    b=0则直接返回3^a取余;
        //    b=1,将一个1+3换成2+2，即返回(3^(a-1)*4)取余;
        //    b=2,则返回(3^a*2)取余
        if(n==2) return 1;
        if(n==3) return 2;
        long res=1;
        while(n>4){
            res=res*3;
            res=res%1000000007;
            n=n-3;//每次去掉3
        }
        //出来循环只有三种情况，分别是n=2、3、4,每种正好分成2、3、4
        return (int)((res*n)%1000000007);
    }
}
