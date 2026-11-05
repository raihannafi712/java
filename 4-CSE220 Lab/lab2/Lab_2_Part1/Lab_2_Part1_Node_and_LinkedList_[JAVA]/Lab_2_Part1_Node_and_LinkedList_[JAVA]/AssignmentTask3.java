// AssignmentTask3: Alternate Merge
public class AssignmentTask3 {
    
    // MUST SUBMIT this method
    public static Node alternateMerge( Node head1, Node head2 ){

        Node temp_1 = head1;
        Node temp_2 = head2;

        while (temp_1 != null && temp_2 != null) {
            
            Node n = new Node(temp_2.elem);                     //If we did Node n = temp_2. It would be the same node with just another variable name

            n.next = temp_1.next;
            temp_1.next = n;

            temp_1 = temp_1.next.next;
            temp_2 = temp_2.next;
        }

        return head1;


        // OR

        
        // Node temp_1 = head1;
        // Node temp_2 = head2;


        // while (temp_1 != null && temp_2 != null) {

        //     Node next1 = temp_1.next;                   //Saving the 2nd node so that LL doesn't get lost
        //     Node next2 = temp_2.next;   

        //     temp_1.next = temp_2;                       //1 -> 5 connection and list 1's other nodes are disconnected. ALSO if list1 has no other nodes left so this list2 node is the last

        //     if (next1 != null) {                        
        //         temp_2.next = next1;                    //Now 1 -> 5 -> 2 done
        //     }

        //     temp_1 = next1;                             //temp1 becomes 2, so 2nd node doesnt get changed and the next one will again in the loop
        //     temp_2 = next2;             
        // }

        // return head1;
    } 

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{1,2,6,8,11});
        Node head2 = LinkedList.createList(new Integer[]{5,7,3,9,4});
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head1);
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head2);
        Node result = alternateMerge(head1, head2);
        System.out.println("\nExpected output: 1 -> 5 -> 2 -> 7 -> 6 -> 3 -> 8 -> 9 -> 11 -> 4");
        System.out.print( "Your output: ");
        LinkedList.printLL(result); //This should print 1 -> 5 -> 2 -> 7 -> 6 -> 3 -> 8 -> 9 -> 11 -> 4
        System.out.println();
        
        System.out.println("\n==============Test Case 2=============");
        head1 = LinkedList.createList(new Integer[]{5,3,2,-4});
        head2 = LinkedList.createList(new Integer[]{-4,-6,1});
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head1);
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head2);
        result = alternateMerge(head1, head2);
        System.out.println("\nExpected output: 5 -> -4 -> 3 -> -6 -> 2 -> 1 -> -4");
        System.out.print( "Your output: ");
        LinkedList.printLL(result); //This should print 5 -> -4 -> 3 -> -6 -> 2 -> 1 -> -4
        System.out.println();

        System.out.println("\n==============Test Case 3=============");
        head1 = LinkedList.createList(new Integer[]{4,2,-2,-4});
        head2 = LinkedList.createList(new Integer[]{8,6,5,-3});
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head1);
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head2);
        result = alternateMerge(head1, head2);
        System.out.println("\nExpected output: 4 -> 8 -> 2 -> 6 -> -2 -> 5 -> -4 -> -3");
        System.out.print( "Your output: ");
        LinkedList.printLL(result); //This should print 4 -> 8 -> 2 -> 6 -> -2 -> 5 -> -4 -> -3
        System.out.println();
    }
}
