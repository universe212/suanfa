package suanfa;

public class QuickSort {

    // 快速排序的主函数
    public static void quickSort(int[] arr, int low, int high) {
        if(low >= high){
            return;
        }

            // 进行分区操作，返回基准值索引
            int pivotIndex = partition(arr, low, high);
            // 对基准值左边的子数组进行快速排序
            quickSort(arr, low, pivotIndex - 1);
            // 对基准值右边的子数组进行快速排序
            quickSort(arr, pivotIndex + 1, high);

    }

    // 进行分区操作的函数
    private static int partition(int[] arr, int low, int high) {
        // 选择最后一个元素作为基准值
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            // 如果当前元素小于或等于基准值
            if (arr[j] <= pivot) {
                i++;
                // 交换i和j位置的元素
                swap(arr, i, j);
            }
        }
        // 交换基准值到它最终的位置
        swap(arr, i + 1, high);
        return i + 1;
    }

    // 交换数组中两个元素的位置
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 主函数，用于测试快速排序算法
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}