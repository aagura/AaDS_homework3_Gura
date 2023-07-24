public class LL {

        Node head;
        Node tail;

    public LL() {
        this.head = null;
        this.tail = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void reverse() {
        Node current = head;
        while (current != null) {
            Node temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = temp;
        }
        Node temp = head;
        head = tail;
        tail = temp;
    }
}


