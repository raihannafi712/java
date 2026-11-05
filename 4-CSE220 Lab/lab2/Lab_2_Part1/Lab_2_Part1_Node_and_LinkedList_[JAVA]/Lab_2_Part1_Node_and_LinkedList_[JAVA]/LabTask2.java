// LabTask2: Word Decoder
public class LabTask2 {
    
    // No need to submit this task
    public static Node wordDecoder( Node head ){
        
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int first_dig = 13 % count;

        temp = head;
        int count2 = 0;
        Node new_head = null;
        Node new_tail = null;

        while (temp != null) {

            if (first_dig != 0 && count2 != 0 && count2 % first_dig == 0 ) {

                Node n = new Node(temp.elem);                                       /* New Node because if we point new head at temp then it won't be a new List */

                if (new_head == null) {
                    new_head = n;
                    new_tail = n;

                } else {
                    new_tail.next = n;                                              /* After setting up head,tail will keep changing rather than temp. Becasue it is a new linked list */
                    new_tail = n;
                }
            }
            temp = temp.next;
            count2++;
        }
        // Letters taken into the new list. T -> A -> C -> null

        Node a = null;
        Node curr = new_head;

        while (curr != null) {
            Node b = curr.next;
            curr.next = a;              //Curr points at a and stops pointing at b
            a = curr;                   //a variable now becomes curr. Like Node n1 was accessed by curr and now it can be accessed by a too 
            curr = b;                   //Then curr becomes b(that Node is b and curr.when loop runs again, b will be the next one)
        }
        Node reversedHead = a;
        // Reversed the list. C -> A -> T -> null

        // Dummy head
        Node dummy = new Node(null);

        dummy.next = reversedHead;
        reversedHead = dummy;

        return dummy;
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Character[]{'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> C -> A -> T
        System.out.println();
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[]{'Z', 'O', 'T', 'N', 'X'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> N
        System.out.println();
    }
}
