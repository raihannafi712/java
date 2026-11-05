
public class Tester {
    
    public static void main(String[] args) {
        //Creating objects of the Node class
        Node n1 = new Node("Hello");
        Node n2 = new Node(324);
        Node n3 = new Node(8.97);
        Node n4 = new Node("python");
        Node n5 = new Node("Java");

        //Creating the linked list
        n1.next = n5;
        n2.next = n3;
        n3.next = n1;
        n4.next = n5;
        n5.next = n2;

        
        System.out.println( n1 );                                   // n1 Node's location
        System.out.println( n3.next );                              // n1 Node's location
        // System.out.println( n2 + n3 );                          // Locations can not be added
        // System.out.println( n1.elem + n5.elem );                // Objects cannot be concated / added
        // fix  (String) n1.elem + (String) n5.elem
        // System.out.println( n3.next.elem + n1.next.elem );      // Objects cannot be concated / added

        Node x = n4.next;                                       // Node x and Node n5 location same. 
        // System.out.println( n1.elem + x.elem );                 // n1.elem + n5.elem and Objects cannot be concated / added

        x.next = n3;                                            // n5.next = n3 instead of n2
        // System.out.println(n2.next.next + n5.next);             // n1 + n3 and Objects cannot be concated / added

        n5 = null;                                              // n5 variable's location is null but we can access it by x
        System.out.println( n4.next.elem );                     // x.elem / Java 

        x.next.next = null;                                     // n3 is now referencing to null`
        // n3.next.elem = 321;                                     // n3.next is null but compile error but runtime error will come
        // n4.next = 532;                                          // we cannot put value inside node reference
        System.out.println(n4.next.elem);                       // x.elem / java         



    }
}
