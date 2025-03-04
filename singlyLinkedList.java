public class singlyLinkedList {

    class Node{
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(String data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void deleteNode(String data) {
        Node current = head;

        if(current.data == data)
        {
            head = current.next;
        }
        else
        {
            Node temp = null;

            while(current != null && current.data != data)
            {
                temp = current;
                current = current.next;
            }

            if(current!=null)
            {
                temp.next = current.next;
            }
            else
            {
                System.out.println("No data found!");
            }
        }
    }

    public void printLL() {
        Node current = head;

        if(head == null) {
            System.out.println("This linked list is still empty!");
            return;
        }
        System.out.print("Linked list = ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        singlyLinkedList singly = new singlyLinkedList();

        singly.addNode("S");
        singly.addNode("A");
        singly.addNode("S");
        singly.addNode("H");
        singly.addNode("A");

        singly.printLL();

        System.out.println("Remove A:");
        singly.deleteNode("A");
        singly.printLL();

        System.out.println("Remove H:");
        singly.deleteNode("H");
        singly.printLL();

    }
}
