import java.util.HashMap;
import java.util.Map;

public class ProductInventory {
    public static void main(String[] args) {
        HashMap<Integer, Integer> inventory = new HashMap<>();
        inventory.put(101, 50);
        inventory.put(102, 30);
        inventory.put(103, 20);
        inventory.put(104, 45);
        inventory.remove(101);

        System.out.println("Final Inventory:");
        for (Map.Entry<Integer, Integer> entry : inventory.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}
