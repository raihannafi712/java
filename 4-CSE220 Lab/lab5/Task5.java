import java.util.Arrays;

public class Task5 {

    public static void kTop(int[] arr , int k){

        MaxHeap n = new MaxHeap(arr.length);            //+1 done by the constructor

        for (int i = 0; i < arr.length; i++) {
            
            n.insert(arr[i]);
        }

        int[] sorted_arr = new int[k];

        for (int i = 0; i < sorted_arr.length; i++) {
            
            sorted_arr[i] = n.extractMax();
        }

        System.err.println(Arrays.toString(sorted_arr));

    }

    public static void main(String[] args) {

        int[] arr = {4,10,2,8,6,7};
        int k = 3;

        kTop(arr, k);




    }




































    // public static int[] largestTop(int[] nums, int k) {
    //     MaxHeap maxHeap = new MaxHeap(nums.length);

    //     int i = 0;
    //     while (i < nums.length) {
    //         maxHeap.insert(nums[i]);
    //         i = i + 1;
    //     }

    //     int[] final_res = new int[k];
    //     int j = 0;

    //     while (j < k) {
    //         final_res[j] = maxHeap.extractMax();
    //         j = j + 1;
    //     }

    //     return final_res;
    // }



    // private static void printArray(int[] array) {
    //     System.out.print("[");
    //     int i = 0;
        
    //     while (i < array.length) {
    //         System.out.print(array[i]);
    //         if (i < array.length - 1) {
    //             System.out.print(", ");
    //         }
    //         i = i + 1;
    //     }
    //     System.out.println("]");
    // }

    // public static void main(String[] args) {
    //     int[] nums = {4, 10, 2, 8, 6, 7};
    //     int k = 3;

    //     int[] result = largestTop(nums, k);

    //     System.out.print("Output: ");
    //     printArray(result);
    // }
}