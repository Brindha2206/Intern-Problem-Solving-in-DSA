package design.lld;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ItemService implements ItemRemote {
    // Temporary
    private List<Items> tempItems = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public Items findItemById(int itemId) {
    for (Items item : tempItems) {
        if (item.getItemId() == itemId) {
            return item;
        }
    }
    return null; // If not found
}

    @Override
    public String newItem(Items items) {
        tempItems.add(items);
        return items.getItemName() + " has been added";
    }

    @Override
    public List<Items> viewItems() {
        return tempItems;
    }

    @Override
    public void alterItem(int itemId) {
        tempItems = tempItems.stream().map(v -> {
            if (v.getItemId() == itemId) {  
                System.out.println(v);
                System.out.println("Enter the thing to update: name or price");
                String choice = scanner.next();
                switch (choice) {
                    case "name":
                        System.out.println("Enter the new name:");
                        v.setItemName(scanner.next());
                        System.out.println("Item name updated");
                        break;
                    case "price":
                        System.out.println("Enter the new price:");
                        v.setItemPrice(scanner.nextDouble());
                        System.out.println("Item price updated");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }
            return v;
        }).collect(Collectors.toList());
    }

    @Override
    public String discontinue(int itemId) {
        int beforeSize = tempItems.size();
        tempItems = tempItems.stream()
                .filter(v -> v.getItemId() != itemId)
                .collect(Collectors.toList());

        if (beforeSize != tempItems.size()) {
            return itemId + " has been discontinued";
        }
        return itemId + " not available";
    }
}
