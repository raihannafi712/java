package task6;
public class PriorityMaxHeap {

    //Basically all the elements of the heap will contain name and its priority
    private String[] tasks;
    private int[] task_prio;
    private int size;
    private int capacity;

    public PriorityMaxHeap(int capacity){
        this.capacity = capacity;
        this.tasks = new String[capacity+1];
        this.task_prio = new int[capacity + 1];
        this.size = 0;
    }

    public void insert(String task,int num){
        if (size >= capacity) {
            System.out.println("Heap full");
            return ;
        }

        size += 1;
        tasks[size] = task;
        task_prio[size] = num;

        heapifyUp(size);
    }


    public void heapifyUp(int idx){

        int current_idx = idx;

        while (current_idx >1) {

            int parent = current_idx/2;

            if (task_prio[parent] < task_prio[current_idx] ) {
                
                //task name swap
                String temp = tasks[current_idx];

                tasks[parent] = tasks[current_idx];
                tasks[current_idx] = temp;


                //task prio swap
                int temp2 = task_prio[current_idx];

                task_prio[parent] = task_prio[current_idx];
                task_prio[current_idx] = temp2;
            }

            current_idx = parent;
            
        }
    }



    public String extractMax(){                 //Only string will return because they just want the task name
        if (size == 0) {
            return null ;
        }

        //task name swap
        String temp = tasks[1];

        tasks[1] = tasks[size];
        tasks[size] = null;


        //task prio swap
        task_prio[1] = task_prio[size];
        task_prio[size] = 0;

        size -= 1;
        heapifyDown(1);

        return temp;
    }



    public void heapifyDown(int idx){

        int current_idx = idx;

        while (true) {
            
            int left_c_idx = (current_idx *2);
            int right_c_idx = (current_idx *2) + 1;
            int highest_val_idx = current_idx;

            if (left_c_idx <= size && task_prio[left_c_idx] > task_prio[highest_val_idx] ) {
                highest_val_idx = left_c_idx;
            }

            if (right_c_idx <= size && task_prio[right_c_idx] > task_prio[highest_val_idx] ) {
                highest_val_idx = right_c_idx;
            }

            if (highest_val_idx == current_idx) {
                break;
            }

            //task name swap
            String temp = tasks[current_idx];

            tasks[highest_val_idx] = tasks[current_idx];
            tasks[current_idx] = temp;


            //task prio swap
            int temp2 = task_prio[current_idx];

            task_prio[highest_val_idx] = task_prio[current_idx];
            task_prio[current_idx] = temp2;


            //Move down
            current_idx = highest_val_idx;

        }
    }


























    // private String[] task;
    // private int[] task_priority;
    // private int size;
    // private int cap_arr;

    // public PriorityMaxHeap(int cap_arr) {
    //     this.cap_arr = cap_arr;
    //     this.task = new String[cap_arr + 1]; 
    //     this.task_priority = new int[cap_arr + 1];
    //     this.size = 0;
    // }



    // public void insert(String taskName, int priority) {
    //     if (size >= cap_arr) {
    //         System.out.println("Heap is full");
    //         return;
    //     }

    //     size = size + 1;
    //     task[size] = taskName;
    //     task_priority[size] = priority;

    //     heapifyUp(size);
    // }





    // public String extractMax() {
    //     if (isEmpty()) {
    //         return null;
    //     }

    //     String max_t = task[1];
    //     task[1] = task[size];
    //     task_priority[1] = task_priority[size];
    //     task[size] = null;
    //     task_priority[size] = 0;
    //     size = size - 1;

    //     heapifyDown(1);
    //     return max_t;
    // }





    // private void heapifyUp(int index) {
    //     int curr_val = index;
    //     while (curr_val > 1) {

    //         int parent = curr_val / 2;
    //         if (task_priority[parent] < task_priority[curr_val]) {
    //             swap(parent, curr_val);
    //             curr_val = parent;
    //         } else {

    //             break;
    //         }
    //     }
    // }




    // private void heapifyDown(int index) {
    //     int curr_val = index;

    //     while (true) {
    //         int left_child = curr_val * 2;
    //         int right_child = curr_val * 2 + 1;
    //         int largest = curr_val;

    //         if (left_child <= size && task_priority[left_child] > task_priority[largest]) {
    //             largest = left_child;
    //         }
    //         if (right_child <= size && task_priority[right_child] > task_priority[largest]) {
    //             largest = right_child;
    //         }
    //         if (largest == curr_val) {
    //             break;
    //         }

    //         swap(curr_val, largest);
    //         curr_val = largest;
    //     }
    // }




    // private void swap(int i, int j) {
    //     String temp_name = task[i];
    //     int temp_p = task_priority[i];

    //     task[i] = task[j];
    //     task_priority[i] = task_priority[j];

    //     task[j] = temp_name;
    //     task_priority[j] = temp_p;
    // }



    
    // public boolean isEmpty() {
    //     if (size == 0) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }
}