class LinkedList{
    Node head;


    public void append(Object val){         /* IMPORTANT */
        
        Node n1 = new Node(val);            /* check Node's contructor */

        if (head == null) {
            head = n1;
            return;                     /* To end the code, because head has been assigned for this call */
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = n1;
    }


       public void printList(){                /* IMPORTANT */
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.elem + " ");
            temp = temp.next;
        }
        System.out.println();
    }




    public void prepend(Object val){        /* IMPORTANT */
        Node newNode = new Node(val);

        newNode.next = head;
        head = newNode;
    }




    public Node nodeAt(int indx){
        
        Node temp = head;
        int count = 0;

        if (indx < 0 ) {
            return null;
        }

        while (temp != null) {
            if (count == indx) {
                return temp;
            }

            temp = temp.next;
            count++;
        }

        return null;
    }



    public void removeFirst(){
        
        if (head == null) {         /* To check if the list is empty */
            return;
        }

        Node temp = head;
        head = head.next;           //Changed the head to the 2nd node
        temp.next = null;           //removed the first node from the list permanently
    }



    

    public void removeLast(){           /* IMPORTANT */

        if (head == null) {             
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    
    }
}