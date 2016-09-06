import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by halleyfroeb on 9/6/16.
 */
public class Inventory {
    public static void main(String[] args) {

        ArrayList<InventoryItem> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            showList(items);

            System.out.println("Options");

            System.out.println("1. Create a new item");
            System.out.println("2. Remove an item");
            System.out.println("3. Update the quantity of an item");

            String option = scanner.nextLine();

            switch (option) {

                case "1":
                    createItem(items, scanner);
                    InventoryItem item;
                    break;
               case "2":
                   deleteItem(items, scanner);
                   break;
                case "3":
                    updateQuantity(items, scanner);
                    break;
                default:
                    System.out.println("Invalid option");
            }

        }

    }

    private static void updateQuantity(ArrayList<InventoryItem> items, Scanner scanner) {
        InventoryItem item;
        System.out.println("Enter the item's number that you want to update");
        int itemIndex = Integer.parseInt(scanner.nextLine());
        item = items.get(itemIndex - 1);
        System.out.println("Enter the quantity of " + item.getText() + " in your inventory");
        Integer newQuantity = Integer.parseInt(scanner.nextLine());
        item.setQuantity(newQuantity);
        items.set(itemIndex-1, item);
        System.out.println("You have " + item.getQuantity() + " " + item.getText());
    }

    private static void deleteItem(ArrayList<InventoryItem> items, Scanner scanner) {
        InventoryItem item;
        System.out.println("Enter the item's number that you want to remove");
        int itemNum = Integer.parseInt(scanner.nextLine());
        item = items.get(itemNum - 1);
        items.remove(item);
    }

    private static void createItem(ArrayList<InventoryItem> items, Scanner scanner) {
        System.out.println("Enter new item name");
        String text = scanner.nextLine();
        System.out.println("Enter the amount of " + text);
        Integer quantity = Integer.parseInt(scanner.nextLine());
        InventoryItem item = new InventoryItem(text, quantity);
        items.add(item);
    }

    private static void showList(List<InventoryItem> items) {
        int i = 1;
        for (InventoryItem item : items) {
            System.out.println(i + ". " + "[" + item.getQuantity() + "] " + item.getText());
            i++;
        }
    }
}