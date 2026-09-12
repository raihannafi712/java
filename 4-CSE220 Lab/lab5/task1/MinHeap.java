public class MinHeap {

    private Integer[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new Integer[capacity + 1];  // +1 because we are using 1-based indexing (First index= 1, index 0 will be null)
        this.size = 0;                          //Size will work as java index basically
    }





    //Insertion
    public void insert(int value) {
        if (size >= capacity) {         //We can't take heap.length because its 6 and we are in java. but pretending our index starts with 1
            System.out.println("Heap is full");
            return;
        }

        size += 1;                  //Increasing size before adding the value. If its the first element then index 0 = null and it will start at index 1
        heap[size] = value;         //if its empty then value will go to index 1
        heapifyUp(size);
    }





    //Deletion
    public Integer extractMin() {
        if (size == 0) {
            return null;
        }

        Integer min_val = heap[1];
        heap[1] = heap[size];           //Last element will be ar the index 1(the root)
        heap[size] = null;              //last index is now null

        size -= 1;                      //One element is removed so size is reduced too
        heapifyDown(1);           //It will check from the top and maintain the min-heap structure (last element is on the top currently)

        return min_val;

    }







    //Checking the smallest element
    public Integer peek() {
        if (size == 0) {
            return null;
        }

        return heap[1];
    }










    // --------------------------
    // Heapify operations
    // --------------------------

    //NOTES
    //If we are working as index 1 = root   [THIS IS THE CORRECT WAY]
    // left child index    = (i * 2)
    // right child index   = (i * 2) + 1
    // Parent    index     = (i / 2)

    //If index 0 = root
    // left child index    = (i * 2) + 1
    // right child index   = (i * 2) + 2
    // Parent  index       = (i - 1) / 2



    private void heapifyUp(int index) {

        int current = index;                //Can not let the index change like the LL head


        while (current > 1) {                       //if we hit the root (index 1) then just end the loop

            int parent = current/2;
            
            if (heap[parent] > heap[current]) {     //If parent == child, no need for swap
            
                int temp = heap[current];               //Store the last value

                heap[current] = heap[parent];           //If parent is 20, currently last elemnent = 20 , parent = 20 
                heap[parent] = temp;                    //Now parent is that lowest element (swap done)

                current = parent;                       //Change the current index to its parent's (where the next check will happen)
            } else {
                break;                              
            }
        }

    }




    
    private void heapifyDown(int index) {                   //Do the tracing

        int current_idx = index;

        while (true) {
            
            int left_child_idx = current_idx*2;                 //In heapifyDown we just need the indices of the children, not the parent
            int right_child_idx = (current_idx*2) + 1;
            int lowest_value_idx = current_idx;

            //Determinig the lowest index between root and child and also left child and right child
            if (left_child_idx <= size && heap[left_child_idx] < heap[lowest_value_idx]) {
                
                lowest_value_idx = left_child_idx;

            }

            if (right_child_idx <= size && heap[right_child_idx] < heap[lowest_value_idx]) {
                
                lowest_value_idx = right_child_idx;

            }

            if (lowest_value_idx == current_idx) {              //Loop will stop when lowest index is the root
                break;
            }

            int temp = heap[current_idx];

            heap[current_idx] = heap[lowest_value_idx];         //lowest index and root value same for the first run
            heap[lowest_value_idx] = temp;                      //Swap complete

            current_idx = lowest_value_idx;

        }
    }

    public boolean isEmpty(){
        if (size == 0) {
            return true;
        }else{
            return false;
        }


    }
}