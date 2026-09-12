//DO NOT TOUCH THIS CLASS
public class QueueLL {

    DNode head;

    public QueueLL() {
        // Creating a Circular Doubly Dummy Head
        head = new DNode(0);

        head.next = head;
        head.prev = head;
    }

    public void printQueue() {

        DNode n = head.next;

        while (n != head) {
            System.out.print(n.elem + " <-> ");
            n = n.next;
        }

        System.out.println();
    }

    public void enqueue(int data) {

        DNode newNode = new DNode(data);

        DNode lastNode = head.prev;

        newNode.prev = lastNode;
        newNode.next = head;

        lastNode.next = newNode;
        head.prev = newNode;
    }

    public int dequeue() {

        if (isEmpty()) {
            System.out.println("Empty Queue!");
            return -1;
        }

        DNode rmNode = head.next;

        DNode before = rmNode.prev;
        DNode after = rmNode.next;

        before.next = after;
        after.prev = before;

        rmNode.next = null;
        rmNode.prev = null;

        return rmNode.elem;
    }

    public boolean isEmpty() {

        if (head == head.next && head == head.prev) {
            return true;
        }
        else {
            return false;
        }
    }
}
