public class doublyLinkedList {

    class Node {
        String data;
        Node next;
        Node prev;

        public Node(String data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(String data) {
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

    public void deleteNode(String data) {
        Node current = head;

        if (current != null && current.data.equals(data)) {
            head = current.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            return;
        }

        Node temp = null;
        while (current != null && !current.data.equals(data)) {
            temp = current;
            current = current.next;
        }

        if (current != null) {
            temp.next = current.next;
            if (current.next != null) {
                current.next.prev = temp;
            } else {
                tail = temp;
            }
        } else {
            System.out.println("No data found!");
        }
    }

    public void printLL() {
        if (head == null) {
            System.out.println("This doubly linked list is still empty!");
            return;
        }

        Node current = head;
        System.out.print("Forward Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("");

        current = tail;
        System.out.print("Backward Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        doublyLinkedList doubly = new doublyLinkedList();

        doubly.addNode("S");
        doubly.addNode("A");
        doubly.addNode("S");
        doubly.addNode("H");
        doubly.addNode("A");

        doubly.printLL();

        System.out.println("Remove A:");
        doubly.deleteNode("A");
        doubly.printLL();

        System.out.println("Remove H:");
        doubly.deleteNode("H");
        doubly.printLL();
    }
}

