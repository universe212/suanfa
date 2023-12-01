package suanfa;

/**
 * ClassName: Solution654
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/27 16:37
 * @Version 1.0
 */
public class Solution654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree1(nums,0,nums.length);
    }

    public TreeNode constructMaximumBinaryTree1(int[] nums, int leftIndex, int rightIndex) {
       if(rightIndex - leftIndex < 1){
           return null;
       }
       if(rightIndex - leftIndex == 1){
           return new TreeNode(nums[leftIndex]);
       }
       int maxIndex = leftIndex;
       int max = nums[maxIndex];//最大值
       for(int i = leftIndex + 1; i < rightIndex; i++){
           if(nums[i] > max){
               max = nums[i];
               maxIndex = i;
           }
       }
       TreeNode root = new TreeNode(max);
       root.left = constructMaximumBinaryTree1(nums, leftIndex, maxIndex);
       root.right = constructMaximumBinaryTree1(nums, maxIndex + 1, rightIndex);
        return root;

    }
    
}
