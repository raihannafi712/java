// import lab_2_part1.src.Node;

public class doublyLinkedList {
    
    // Node class
    public static class Node{
        int val;
        Node next;
        Node prev;

        Node (int val){
            this.val = val;
        }
    }







    // Tester
    public static void main(String[] args) {


        // doublyLL ll = new doublyLL();            /* If method class is used */
        
        //Node creation

        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
        // 4 10 2 99 13

        a.prev = null;      /* optional */  /* It's the head */
        a.next = b; 
        b.prev = a;         
        // 4 <> 10 

        b.next = c;
        c.prev = b;
        // 4 <> 10 <> 2

        c.next = d; 
        d.prev = c;
        // 4 <> 10 <> 2 <> 99

        d.next = e;
        e.prev = d;
        e.next = null;      /* optional */  /* It's the tail */
        // null < 4 <> 10 <> 2 <> 99 <> 13 > null  /* null.prev will make error because null is not a node. */     
        
        



        // Now to create the same node for ll object
        // ll.insertAtBeginning(e, 0);




        // DISPLAY
        
        // To normally print
        System.out.println("Doubly linked list- ");
        display(a);
        // ll.display(a);

        // To print with the tail in reverse
        System.out.println("Doubly linked list in reverse- ");
        displayrev(e);
        // ll.displayrev(e);

        // To print with any random node
        System.out.println("Doubly linked list from any given node- ");
        displayAny(d);
        // ll.displayAny(d);




        // INSERTION

        // At beginning
        Node newHead = insertAtBeginning(a, 300);           /* To create new head for the same linked list */
        // insertAtBeginning(a, 300);
        System.out.println("Linked list after new head- ");
        display(newHead);
        


        // At end
        Node newTail = insertAtEnd(newHead, 400);           /* To create new head for the same linked list */
        System.out.println("Linked list after new tail- ");
        display(newHead);


        // At any index
        insertAt(newHead, 4, 69);           /* It displays on its own */


        // To delete at a given index
        // deleteAt(newHead, 7);
        // display(newHead);


        //Reverse LL
        Node h = revDoubly(newHead);
        display(h);

        // Primarily - > null < 300 <> 4 <> 10 <> 2 <> 69 <> 99 <> 13 <> 400 > null
        // Reversed  - > null < 400 <> 13 <> 99 <> 69 <> 2 <> 10 <> 4 <> 300 > null

        //Double LL reversing may seem same but its not. At first it was 300.next = 4 and later, 300.next = null



    }




    // METHODS


    // DISPLAY
    public static void display(Node head){

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void displayrev(Node tail){

        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }


    public static void displayAny(Node node){

        Node temp = node;

        while (temp.prev != null) {         /* We need the head so it has to be temp.prev. Just temp means we are having the null node */
            
            temp = temp.prev;
        }
        Node head = temp;

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }


    public static Node insertAtBeginning(Node head , int val){

        Node obj = new Node(val);

        if (head == null) {
            obj = head ; 
        } else {
            obj.next = head;            /* Firstly connect the new node to head */
            head.prev = obj;            /* Then make the connection on both side */
            head = obj;                 /* Now, head becomes obj */
        }

        return obj;
    }


    public static Node insertAtEnd(Node head,int val){

        Node obj = new Node(val);
        Node temp = head;

        if (head == null) {
            obj = head ; 
        } else {
            while (temp.next != null) {     /* to find the tail */
                temp = temp.next;
            } 

            obj.prev = temp;            /* Firstly connect the new node to tail */
            temp.next = obj;            /* Then make the connection on both side */
            temp = obj;                 /* Now, head becomes obj */
        }

        return obj;
    }


    public static int length(Node head){

        System.out.println();
        int count = 0;

        while (head != null) {
            count++;
            head = head.next;
        }
        
        return count ;
        
    }

    public static void insertAt(Node head,int idx, int val){
        Node temp = head;
        Node obj = new Node(val);

        if (idx == length(head) ) {
            Node newTail = insertAtEnd(head, val);
            display(head);
            return;

        }else if (idx == 0) {
            Node newHead = insertAtBeginning(head, val);
            display(newHead);
            return;
        }

        for (int i = 0; i < (idx - 1); i++) {
            temp = temp.next;
        }

        Node after = temp.next;                     /* The node that will be replaced */

        // temp > obj > after
        temp.next = obj;
        obj.prev = temp;
        obj.next = after;
        after.prev = obj;

        display(head);

    }
   

    public static void deleteAt(Node head,int idx){                 /* Not cleared */
        Node temp = head;

        if (idx == 0) {
            head = head.next;
            head.prev = null;
        }

        for (int i = 0; i < idx ; i++) {

            if (temp == null) {
                System.out.println("Index out of bounds");
            }
            temp = temp.next;
        }
        if (temp.next == null) {
            temp.prev.next = null;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;


    }



    //Reversing
    // Primarily - > null < 300 <> 4 <> 10 <> 2 <> 69 <> 99 <> 13 <> 400 > null
    // Reversed  - > null < 400 <> 13 <> 99 <> 69 <> 2 <> 10 <> 4 <> 300 > null

    //Double LL reversing may seem same but its not. At first it was 300.next = 4 and later, 300.next = null
    public static Node revDoubly(Node head) {
        if (head == null || head.next == null) {
            return head; // Empty list or single node
        }

        Node curr = head;
        Node newHead = null;

        while (curr != null) {
            // 1. Temporarily save the original next node
            Node nextTemp = curr.next;

            // 2. Swap the next and prev pointers
            curr.next = curr.prev;
            curr.prev = nextTemp;

            // 3. Keep track of the current node as the new head candidate
            newHead = curr;

            // 4. Move to the next node. 
            // Notice we use curr.prev because the original 'next' is now stored there!
            curr = curr.prev;
        }

        return newHead; // This will be the old tail, now the new head
    }



}


























    // // Method class
    // public static class doublyLL{
    //     Node head = null;
    //     Node tail = null;


    //     // DISPLAY
    //     void display(Node head){

    //         Node temp = head;

    //         while (temp != null) {
    //             System.out.print(temp.val + " ");
    //             temp = temp.next;
    //         }
    //         System.out.println();
    //     }

        
    //     void displayrev(Node tail){

    //         Node temp = tail;

    //         while (temp != null) {
    //             System.out.print(temp.val + " ");
    //             temp = temp.prev;
    //         }
    //         System.out.println();
    //     }


    //     void displayAny(Node node){

    //         Node temp = node;

    //         while (temp.prev != null) {         /* We need the head so it has to be temp.prev. Just temp means we are having the null node */
                
    //             temp = temp.prev;
    //         }
    //         Node head = temp;

    //         while (head != null) {
    //             System.out.print(head.val + " ");
    //             head = head.next;
    //         }
    //         System.out.println();
    //     }


    //     void insertAtBeginning(Node head , int val){

    //         Node obj = new Node(val);

    //         if (head == null) {
    //             obj = head = tail; 
    //         } else {
    //             obj.next = head;            /* Firstly connect the new node to head */
    //             head.prev = obj;            /* Then make the connection on both side */
    //             obj = head;
    //         }
    //     }

    // }
