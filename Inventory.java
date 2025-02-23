import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;

    // Constructor
    public Inventory() {
        this.items = new ArrayList<>(); // Initialize the items list
    }

    // Method to add an item to the inventory
    public void addItem(Item item) {
        items.add(item);
        System.out.println(item.getName() + " added to inventory.");
    }

    // Method to remove an item from the inventory
    public void removeItem(Item item) {
        if (items.contains(item)) {
            items.remove(item);
            System.out.println(item.getName() + " removed from inventory.");
        } else {
            System.out.println(item.getName() + " is not in the inventory.");
        }
    }

    // Method to check if an item exists in the inventory
    public boolean hasItem(Item item) {
        return items.contains(item);
    }

    // Method to display all items in the inventory
    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("Nothing in inventory.");
        } else {
            System.out.println("Inventory items:");
            for (Item item : items) {
                System.out.println("- " + item.getName());
            }
        }
    }

    // Method to get the total number of items
    public int getItemCount() {
        return items.size();
    }
}
