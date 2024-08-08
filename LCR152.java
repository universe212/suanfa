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

    private boolean verify(int[] postorder, int x, int y) {
        if( x >= y){
            return true;
        }
        int i = x;//左边
        while (postorder[i] < postorder[y]) i++;//说明i到右边了
        int m = i;//此时的m大于根说明是根的右节点
        //i是根的右节点的第一个
        while (postorder[i] > postorder[y]) i++; //这里是判断 右子树是不是都满足大于根，如果有一个不满足后面 p和j不相等说明不是搜索二叉树
        int p = i;
        return p == y&& verify(postorder,x,m - 1) && verify(postorder,m,p-1);
    // p 应该到末尾 刚刚满足
    }


}

