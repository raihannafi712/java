// AssignmentTask4: ID Generator
public class AssignmentTask4{
    
    // MUST SUBMIT this method
    public static Node idGenerator(Node head1, Node head2, Node head3) {            /* Important */

        Node temp1 = head1;
        Node temp2 = head2;
        Node temp3 = head3;

        //reverse
        Node prev = null;                       //Node prev = new Node(null); would make it another node and last node would be another null
        Node curr = head1;

        while (curr != null) {
            
            Node next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head1 = prev;
        temp1 = head1;

        while (temp1.next != null) {
            
            temp1 = temp1.next;
        }

        while (temp2 != null) {

            Node n = new Node((int) temp2.elem + (int) temp3.elem);
            
            temp1.next = n;

            temp1 = temp1.next;
            temp2 = temp2.next;
            temp3 = temp3.next;


        }

        return head1;






































        
        // Node temp_1 = head1;
        // Node temp_2 = head2;
        // Node temp_3 = head3;

        // Node head_final = new Node(null);
       

        // //To reverse and add to new list
        // Node a = null;
        // while (temp_1 != null) {

        //     Node b = temp_1.next;
        //     temp_1.next = a;              //temp_1 points at a and stops pointing at b
        //     a = temp_1;                   //a becomes temp_1
        //     temp_1 = b;                   //Then curr becomes b(that Node is b and curr.when loop runs again, b will be the next one)
 
        // }
        // head_final = a;
        // Node temp_final = head_final;

        // //temp.final goes to the last node
        // while (temp_final.next != null) {
        //     temp_final = temp_final.next;
        // }


        // while (temp_2 != null && temp_3 != null) {
            
        //     int sum = (int)temp_2.elem + (int) temp_3.elem;
            
        //     if (sum >= 10) {

        //         int fin = sum % 10;
        //         Node n = new Node(fin);

        //         temp_final.next = n;

        //     } else {
        //         Node n = new Node(sum);

        //         temp_final.next = n;
        //     }
            
        //     temp_2 = temp_2.next;
        //     temp_3 = temp_3.next;
        //     temp_final = temp_final.next;
        // }

        // return head_final; 
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT MAKE ANY MODIFICATIONS IN THE TESTER CODE BELOW
    //DO NOT SUBMIT THE DRIVER CODE BELOW
    public static void main(String[] args) {
        System.out.println("=========Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{0, 3, 2, 2});
        Node head2 = LinkedList.createList(new Integer[]{5, 2, 2, 1});
        Node head3 = LinkedList.createList(new Integer[]{4, 3, 2, 1});

        System.out.print("LinkedList#1:  ");
        LinkedList.printLL(head1); // This should print 0 -> 3 -> 2 -> 2

        System.out.print("LinkedList#2:  ");
        LinkedList.printLL(head2); // This should print 5 -> 2 -> 2 -> 1

        System.out.print("LinkedList#3:  ");
        LinkedList.printLL(head3); // This should print 4 -> 3 -> 2 -> 1

        Node result = idGenerator(head1, head2, head3);

        System.out.print("\nNew ID:  ");
        LinkedList.printLL(result); // This should print 2 -> 2 -> 3 -> 0 -> 9 -> 5 -> 4 -> 2

        System.out.println("\n=========Test Case 2=============");
        Node head4 = LinkedList.createList(new Integer[]{0, 3, 9, 1});
        Node head5 = LinkedList.createList(new Integer[]{3, 6, 5, 7});
        Node head6 = LinkedList.createList(new Integer[]{2, 4, 3, 8});

        System.out.print("LinkedList#4:  ");
        LinkedList.printLL(head4); // This should print 0 -> 3 -> 9 -> 1

        System.out.print("LinkedList#5:  ");
        LinkedList.printLL(head5); // This should print 3 -> 6 -> 5 -> 7

        System.out.print("LinkedList#6:  ");
        LinkedList.printLL(head6); // This should print 2 -> 4 -> 3 -> 8

        Node result2 = idGenerator(head4, head5, head6);

        System.out.print("\nNew ID:  ");
        LinkedList.printLL(result2); // This should print 1 -> 9 -> 3 -> 0 -> 5 -> 0 -> 8 -> 5
    }
}
