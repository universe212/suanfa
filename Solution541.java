package suanfa;

/**
 * ClassName: Solution541
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/20 19:31
 * @Version 1.0
 */
public class Solution541 {
    public String reverseStr(String s, int k) {
        int n = s.length();
        char[] arr = s.toCharArray();
        for(int i = 0; i < n; i += 2*k){
            reverse(arr,i,Math.min(i + k,n) - 1); // Math.min(i + k,n) 判断是返全部还是k
        }
        return new String(arr);
    }

    private void reverse(char[] arr, int left, int right) {
     while (left < right){
         char temp = arr[right];
         arr[right] = arr[left];
         arr[left] = temp;
         left++;
         right--;
     }
    }
}
