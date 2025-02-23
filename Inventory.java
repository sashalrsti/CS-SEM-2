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
        System.out.println(item.getName() + " has been added to your inventory.");
    }

    // Method to check if an item exists in the inventory
    public boolean hasItem(Item item) {
        return items.contains(item);
    }

    // Method to remove an item from the inventory
    public void removeItem(Item item) {
        if (hasItem(item)) {
            items.remove(item);
            System.out.println(item.getName() + " has been removed from your inventory.");
        } else {
            System.out.println(item.getName() + " is not in your inventory.");
        }
    }


    // Method to display all items in the inventory
    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Items in your inventory:");
            for (int i = 0; i < items.size(); i++) {
                System.out.println((i + 1) + ". " + items.get(i).getName());
            }
        }
    }


    // Method to get the total number of items
    public int getItemCount() {
        return items.size();
    }
}
