package suanfa;

/**
 * ClassName: Solution108
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/1 19:21
 * @Version 1.0
 */
public class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = traversal(nums,0,nums.length - 1);
        return root;
    }

    // 左闭右闭区间[left, right]
    private TreeNode traversal(int[] nums, int left, int right) {
       if(left > right){
           return null;
       }
       int mid = left + ((right - left) / 2);
        TreeNode root = new TreeNode(nums[mid]);
       root.left = traversal(nums,left,mid - 1);
        root.right = traversal(nums,mid + 1,right);
        return root;
    }

}
