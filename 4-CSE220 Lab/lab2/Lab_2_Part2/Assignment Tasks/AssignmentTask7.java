public class AssignmentTask7 {

    //SUBMIT ONLY THIS METHOD
    public static void rangeMove(DNode dh, int start, int end) {
        
    DNode curr = dh.next;

    DNode movedHead = null;   // first node in our "moved" sub-list
    DNode movedTail = null;   // last node in our "moved" sub-list

    while (curr != dh) {

        DNode next = curr.next;   // save before unlinking, or we lose the path forward

        if ((int) curr.elem >= start && (int) curr.elem <= end) {

            // Unlink curr from its current spot in the main list
            curr.prev.next = curr.next;
            curr.next.prev = curr.prev;

            // Attach curr to the end of our separate "moved" chain
            if (movedHead == null) {
                movedHead = curr;
                movedTail = curr;
                curr.prev = null;
                curr.next = null;
            } else {
                movedTail.next = curr;
                curr.prev = movedTail;
                curr.next = null;
                movedTail = curr;
            }
        }

        curr = next;   // move forward using the saved pointer, regardless of what happened above
    }

    // If nothing was moved, the list is unchanged -- nothing left to splice
    if (movedHead == null) {
        return;
    }

    // Splice the moved chain onto the end of the remaining circular list
    DNode oldTail = dh.prev;   // current last node (before splicing)

    oldTail.next = movedHead;
    movedHead.prev = oldTail;

    movedTail.next = dh;
    dh.prev = movedTail;
    }

    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] values = {5, 3, 7, 1, 9, 6, 2, 4};
        DNode dh = LinkedListHelpers.createDummyHeadedDoublyLL(values, true);

        System.out.println("Given Linked List:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);

        System.out.println("\nExpected Output:");
        Object[] expected = {3, 1, 9, 2, 4, 5, 7, 6};
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);
        
        //Running the Range Move with [5,7] range 
        rangeMove(dh, 5, 7);
        //Printing after Range Move
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);
    }
}
