public class singlyLinkedList {


    // Node class (It can be created in another file or also like this)
    // This Node class is always same for any code
     
    public static class Node{           /* Static nested class */   /* Basically design class */

        Object data;                    //value                     /* This is used to print in the tester class. Ex- head.data (where head is a variable of Node data type) */
        Node next;                      //address of the next node

        Node(Object data){                 // If there is Node(int data) - it means the nodes can store only int data type
            this.data = data;
        }
    }



    // CHECK MAIN METHOD FIRST TO SEE HOW TO CREATE NODES AND BASIC CONNECTIONS MADE BETWEEN NODES




    // Design class / method class
    // To use this class, we need to create an object of this class in the main class all the time
    // The methods cannot be static 

    public static class linkedList{     /* Another static nested class */   /* It basically creates and stores the head and tail Nodes and methods can use them easily */
        Node head = null;
        Node tail = null;




        // Display manually
        void display(Node head) {     

            Node temp = head;                       //So that when loop runs, head does not get lost(If head is lost then the linked list will be lost too)

            while (temp != null) {      
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();
        }





        //Display with recursion
        void displayr(Node head){         /* With recursion */

            if(head == null){
                System.out.println();
                return;
            }
            System.out.print(head.data + " ");
            displayr(head.next);                        /* After printing one element,call the next element with recursion */
        }








        // To make linked list through a method / Add new elements at the end of the list           (THIS IS CALLED APPENDING)
        // just make an object of this class and use the method 
        void insertAtEnd(int val){

            Node temp = new Node(val);      /* The value is now a variable of Node data type and it can be used in linked list */

            if (head == null) {             /* If the list is empty */ /* New element is head and tail both */
                head = tail = temp; 
            } else {                        /* If there is one element or more, then the tail's next element would be this val */
                tail.next = temp;
            }
            tail = temp;                    /* This updates the tail everytime a new element is added to the list */
                               
        }







        // To add new elements at the beginning of the list           (THIS IS CALLED PREPENDING)          
        void insertAtBeginning(int val){

            Node obj = new Node(val);
            if (head == null) {
                head = tail = obj;          
            } else {
                obj.next = head;                /* This adds the new element before the head */
                head = obj;                     /* Now that new element is the head */
            }
        }









        // To add element at a given index      /* MEMORIZE */
        void insertAt(int idx, int val){

            Node obj = new Node(val);
            Node temp = head;

            if (idx == length(head)) {              /* If new element is creating a new node at the end */
                insertAtEnd(val);
                return;
            }

            if (idx == 0) {                         /* If new element is being added at the beginning */
                insertAtBeginning(val);
                return;
            }

            for (int i = 0; i < (idx - 1); i++) {       /* idx - 1 because the new element won't directly take the exact index  */
                temp = temp.next;
            }
            obj.next = temp.next;                       /* Connecting new node to the one that will be replaced */
            temp.next = obj;                            /* Replaced */
        }





        



        // linked list length
        int length(Node head){
            System.out.println();
            int count = 0;

            while (head != null) {
                count++;
                head = head.next;
            }
            
            return count ;
        
        }






        // To get an element from any given index
        int getAt(int idx){

            if (idx < 0 || idx > length(head)) {            /* In case of invalid index */
                System.out.println("Wrong index");
                return -1;
            }

            Node temp = head;

            for (int i = 0; i < idx; i++) {            /* It will keep looping until given index */
                temp = temp.next;                       /* The last index will be the desired one */
            }
            return (int) temp.data;
        }









        // To delete a node from given index
        void deleteAt(int idx){

            Node temp = head;
            for (int i = 0; i < (idx - 1); i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;                 /* we are in the previous index of the given one. Then just make the next one go and connect its next  */
            
            if (idx == length(head)) {                  /* If the last node is deleted */
                tail = temp;
            }else if (idx == 0) {                       /* If the first node is deleted */
                head = head.next;
            }

            
        }





        // To separate positive and negative numbers from an array and print as linked list
        void sep(int [] arr){
            Node head_pos = null ;
            Node head_neg = null;

            for (int i = 0; i < arr.length; i++) {

                Node n = new Node(arr[i]);
                
                if (arr[i] < 0) {
                    
                    if (head_neg == null) {
                        head_neg = n;
                    }else{

                        Node temp = head_neg;
                    while (temp.next != null) {              //it means whenever temp == null, the loop will stop right there and won't do the temp = temp.next

                        temp = temp.next;
                    }
                    temp.next = n;
                    }

                } else {

                    if (head_pos == null) {
                        head_pos = n;
                    }else{
                        Node temp = head_pos;
                    while (temp.next != null) {

                        temp = temp.next;
                    }
                    temp.next = n;
                    }

                }

            }

            System.out.println("Pos linked list-");
            Node temp1 = head_pos;
            while (temp1 != null ) {
                System.out.print(temp1.data + " ");
                temp1 = temp1.next;
            }

            System.out.println();

            System.out.println("Neg linked list-");
            Node temp2 = head_neg;
            while (temp2 != null ) {
                System.out.print(temp2.data + " ");
                temp2 = temp2.next;
            }
            System.out.println();
        }








        // Dummy headed Singly linked list (Send the head and it will create and show the dummy headed linked list)
        Node dummy(Node head){

            Node n = new Node(null);

            n.next = head;
            head = n;

            return n;
        }









        // Creating a new linked list
        void newList(Node head){

            Node temp = head;
            Node new_head = null;
            Node new_tail = null;

            while (temp != null) {

                Node n = new Node(temp.data);
                
                if (new_head == null) {
                    new_head = n;
                    new_tail = n;
                } else {
                    new_tail.next = n;
                    new_tail = n;
                }
                temp = temp.next;
            }

            display(new_head);
        }









        //Reversing a linked list manually  (CHECK NOTES TO SEE HOW IT EXACTLY WORKS)
        Node rev(Node head){

            Node curr = head;
            Node prev = null;
            
            
            while (curr != null) {
                Node next = curr.next;
                curr.next = prev;              //curr points at prev and stops pointing at next
                prev = curr;                   //prev becomes curr
                curr = next;                   //Then curr becomes next(that Node can be accessed by next and also curr. When loop runs again, b will be the next one)
            }
            Node reversedHead = prev;

            return reversedHead;            //New head is returned
        }








        //Reversing a linked list with recursion
        void displayrev(Node head){
        
            if(head == null){
                return;
            }
            displayrev(head.next);                    /* Creating stack. FIrst in first out */
            System.out.print(head.data + " ");
                      
        }








        //This method will recieve a head and a boolean (true- list rotates right, false list rotates left)
        //true-  20 -> 10 -> 30 becomes 30 -> 20 -> 10
        //false- 20 -> 10 -> 30 becomes 10 -> 30 -> 20
        void rotateList(Node head,Boolean n){

            if (n) {
                
                Node second_last = head;
                Node last = head.next;

                while (last.next != null) {
                    last = last.next;
                    second_last = second_last.next;
                }

                last.next = head.next;
                head.next = last;
                second_last.next = null;

            } else {

                Node first = head.next;
                Node last = head.next;

                while (last.next != null) {
                    last = last.next;
                }

                head.next =first.next;
                first.next = null;

                last.next = first;
                
            }
        }










    }
















    // Tester
    public static void main(String[] args) {


        // LINKED LIST BASICS-

        //  NODE CREATION

        Node a = new Node(5);              /* Node class's new object */
        //Node a = 5;                           /* This means a is just a reference variable and does not point to any Node.Which means it's not a Node */
        
        
        //Print
        System.out.println(a);                  /* Node a's location */ /* a is the head of the linked list */
        System.out.println("Node a data- " + a.data); 
        System.out.println(a.next);             /* Node a's next node's location which is not assigned yet (null) */



        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(66);
        Node e = new Node(78);
        Node test = e;                          //It means the Node e can be accessed by 2 variables. e and test both.
        Node test2 = new Node(e.data);          //This means test2 is a new Node and it has the value of the node e
        // 5 4 3 66 78




        // To connect and make a linked list manually        /* Let's call this Linked list 1 */
        // Before connecting, a empty list is null and null is both head and tail AND In cases of one element inside a linked list, it means its the head and tail both of that list

        a.next = b; // 5 -> 4 3 66 78
        b.next = c; // 5 -> 4 -> 3 66 78
        c.next = d; // 5-> 4 -> 3 -> 66 78
        d.next = e; // 5-> 4 -> 3 -> 66 -> 78
        



        //To remove the last element
        d.next = null;  // 5-> 4 -> 3 -> 66



        //Now-
        Node n = new Node(100);
        n.next = b;

        // 5-> 4 -> 3 -> 66
        //     ^
        //     |
        //    100

        //So, Two (or even more) different nodes can point to the same node.






















        //CREATING AN OBJECT AND TESTING ALL THE METHODS CREATED OUTSIDE MAIN METHOD
        linkedList ll = new linkedList();

        // Before creating any linked list, we specified head and tail as null in the linkedList class so it's object will show the same thing
        // System.out.println(ll.head.data);
        // System.out.println(ll.tail.data);




        // To add element at the end of the list(new tail)  (THIS IS CALLED APPENDING)
        ll.insertAtEnd(4);
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(40);




        // To see head and tail separately
        System.out.println("linkedList class's ll object's linked list's head and tail- ");
        System.out.print("head " + ll.head.data + " , ");
        System.out.println("tail " + ll.tail.data);





        ll.display(ll.head);                       /* It means ll object's linked list's head is inserted */
        // 4 > 10 > 20 > 40


        ll.insertAtBeginning(12);
        ll.display(ll.head);                        /* 12 > 4 > 10 > 20 > 40 */

        ll.insertAt(2, 100);
        ll.display(ll.head);                        /* 12 > 4 > 100 > 10 > 20 > 40 */


        // To insert at the 0th index
        ll.insertAt(0, 500);        
        ll.display(ll.head);                        /* 500 > 12 > 4 > 100 > 10 > 20 > 40 */







        // To return a given index's value
        System.out.println("The element of the 4th index- " + ll.getAt(4));












        // To delete a node from given index
        ll.deleteAt(0);
        ll.display(ll.head);
        System.out.print("head " + ll.head.data + " , ");
        System.out.println("tail " + ll.tail.data);             
        System.out.println("Length- " + ll.length(ll.head));






        // To separate pos and neg elements from array and print as 2 linked lists
        int [] arr = {-1,-3,6,-8,-20,90,-90,400,0,-300,700};

        ll.sep(arr);




        // ll.display(ll.head); 
        // ll.dummy(ll.head); 







        // Creating a new linked list
        System.out.println("Original list- " );
        ll.display(ll.head);
        System.out.println("New list- " );
        ll.newList(ll.head);





        // To reverse a linked list
        // ll.rev(ll.head);




        //Rotating linked list 
        Node dum = ll.dummy(ll.head);
        ll.display(dum);                //Original list
        ll.rotateList(dum, false);
        System.out.println("Rotated list-");
        ll.display(dum);                //Rotated list

       







        
        
        
    }
}
