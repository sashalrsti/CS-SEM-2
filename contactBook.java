import java.util.Scanner;

class contactNode {
    String name, phone, email;
    contactNode next;

    contactNode(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.next = null;
    }
}

class contactSystem {
    private contactNode head;

    void addContact(String name, String phone, String email) {
        contactNode newContact = new contactNode(name, phone, email);
        if (head == null) {
            head = newContact;
        } else {
            contactNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newContact;
        }
        System.out.println("Contact added: " + name);
    }

    void deleteContact(String name) {
        if (head == null) {
            System.out.println("No contacts here.");
            return;
        }

        if (head.name.equalsIgnoreCase(name)) {
            head = head.next;
            System.out.println("Contact removed: " + name);
            return;
        }

        contactNode current = head;
        while (current.next != null && !current.next.name.equalsIgnoreCase(name)) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Contact is not found.");
        } else {
            current.next = current.next.next;
            System.out.println("Contact deleted: " + name);
        }
    }

    void searchName(String name) {
        contactNode current = head;
        while (current != null) {
            if (current.name.equalsIgnoreCase(name)) {
                System.out.println("Contact found: \n" + current.name + ", " + current.phone + ", " + current.email);
                return;
            }
            current = current.next;
        }
        System.out.println("No contact found.");
    }

    void searchEmail(String email) {
        contactNode current = head;
        while (current != null) {
            if (current.email.equalsIgnoreCase(email)) {
                System.out.println("Contact found: " + current.name + ", " + current.phone + ", " + current.email);
                return;
            }
            current = current.next;
        }
        System.out.println("No contact found.");
    }

    void showContacts() {
        if (head == null) {
            System.out.println("Empty.");
            return;
        }
        System.out.println("📖 Contact List:");
        contactNode current = head;
        while (current != null) {
            System.out.println("➡ " + current.name + " - " + current.phone + " - " + current.email);
            current = current.next;
        }
    }
}

public class contactBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        contactSystem contactManager = new contactSystem();

        while (true) {
            System.out.println("\n==================================");
            System.out.println("Contact Book");
            System.out.println("(A) Add Contact");
            System.out.println("(D) Delete Contact");
            System.out.println("(S) Search by Name");
            System.out.println("(E) Search by Email");
            System.out.println("(P) Show All Contacts");
            System.out.println("(Q) Quit");
            System.out.println("==================================");
            System.out.print("Please enter a command: ");
            String choice = scanner.next().toUpperCase();
            scanner.nextLine();

            switch (choice) {
                case "A":
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    contactManager.addContact(name, phone, email);
                    break;
                case "D":
                    System.out.print("Enter: ");
                    String delName = scanner.nextLine();
                    contactManager.deleteContact(delName);
                    break;
                case "S":
                    System.out.print("Enter: ");
                    String searchName = scanner.nextLine();
                    contactManager.searchName(searchName);
                    break;
                case "E":
                    System.out.print("Enter: ");
                    String searchEmail = scanner.nextLine();
                    contactManager.searchEmail(searchEmail);
                    break;
                case "P":
                    contactManager.showContacts();
                    break;
                case "Q":
                    System.out.println("Bye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Error.");
            }
        }
    }
}


