public class node {
    Node head;
    static class Node{
        String data;
        Node next;
        Node(String newData) {
            data = newData;
            next = null;
        }
    }
    public static void main(String[] args) {
        node list = new node();
        Node john = new Node("John");
        Node doe = new Node("Doe");
        Node jane = new Node("Jane");
        Node dae = new Node("Dae");

        list.head = john;
        john.next = doe;
        doe.next = jane;
        jane.next = dae;

        System.out.print("List:\n" + list.head.data);
        System.out.print(list.head.next.data);
        System.out.print(list.head.next.next.data);
        System.out.print(list.head.next.next.next.data);

        Node jeni = new Node("Jeni");
        jeni.next = john;
        list.head = jeni;
        System.out.print("\nAdding Jeni to the list:\n" + list.head.data);
        System.out.print(list.head.next.data);
        System.out.print(list.head.next.next.data);
        System.out.print(list.head.next.next.next.data);
        System.out.print(list.head.next.next.next.next.data);


        list.head = john;
        System.out.print("\nRemoving Jeni:\n" + list.head.data);
        System.out.print(list.head.next.data);
        System.out.print(list.head.next.next.data);
        System.out.print(list.head.next.next.next.data);

    }
}

