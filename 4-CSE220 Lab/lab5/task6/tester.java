package task6;
import java.util.Arrays;

public class tester {

    public static void taskSchedule(String[] task,int[] prio){

        PriorityMaxHeap n = new PriorityMaxHeap(prio.length);           //+1 auto by constructor

        //Now we just insert the string and int array inside the heap
        for (int i = 0; i < prio.length; i++) {
            
            n.insert(task[i], prio[i]);
        }

        String[] arr2 = new String[task.length];
        //just extract the highest priority tasks and put into the new String array
        for (int i = 0; i < arr2.length; i++) {
            
            arr2[i] = n.extractMax();
        }

        System.err.println(Arrays.toString(arr2));
    }





























    // public static String[] taskSchedule(String[] taskNames, int[] priorities) {
    //     PriorityMaxHeap heap = new PriorityMaxHeap(taskNames.length);

    //     int i = 0;
    //     while (i < taskNames.length) {

    //         heap.insert(taskNames[i], priorities[i]);
    //         i = i + 1;
    //     }

    //     String[] result = new String[taskNames.length];
    //     int j = 0;

    //     while (!heap.isEmpty()) {
    //         result[j] = heap.extractMax();
    //         j = j + 1;
    //     }

    //     return result;
    // }




    // private static void printArray(String[] array) {
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



    
    public static void main(String[] args) {
        String[] taskNames = {"Email", "Meeting", "Code Review", "Lunch", "Debug"};
        int[] priorities = {2, 5, 3, 1, 4};

        taskSchedule(taskNames, priorities);
    }
}