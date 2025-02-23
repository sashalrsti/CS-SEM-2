public class Main3 {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Item bazooka = new Item("Bazooka");
        inventory.addItem(bazooka);
        Item canon = new Item("Canon");
        inventory.addItem(canon);
        Item wool = new Item("Wool");
        inventory.addItem(wool);

        inventory.displayItems();

        inventory.removeItem(bazooka);
        inventory.removeItem(wool);

        inventory.displayItems();

        System.out.println("Total items in your inventory: " + inventory.getItemCount());
    }
}

