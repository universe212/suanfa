package suanfa;

/**
 * ClassName: LCR152
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/16 20:35
 * @Version 1.0
 */
public class LCR152 {
    public boolean verifyTreeOrder(int[] postorder) {
        return  verify(postorder,0,postorder.length - 1);
        //实际上是找这个树满足二叉搜索树不
    }

    private boolean verify(int[] postorder, int q, int j) {
        if( q >= j){
            return true;
        }
        int i = q;
        while (postorder[i] < postorder[j]) i++;
        int m = i;//此时的m大于根说明是根的右节点
        while (postorder[i] > postorder[j]) i++; //这里是判断 右子树是不是都满足大于根，如果有一个不满足后面 p和j不相等说明不是搜索二叉树
        int p = i;
        return p == j && verify(postorder,q,m - 1) && verify(postorder,m,p-1);
    }


}

