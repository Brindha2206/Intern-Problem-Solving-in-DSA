package design.lld;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    
    public static void main(String[] args) {
        ItemService itemService = new ItemService();
        BillingService billingService = new BillingService();
        Scanner scanner = new Scanner(System.in);

        itemService.newItem(new Items(1, "Pen", 10));
        itemService.newItem(new Items(2, "Notebook", 25));
        itemService.newItem(new Items(3, "Milk", 10));
        itemService.newItem(new Items(4, "Rice", 300));
        itemService.newItem(new Items(5, "Shampoo", 240));
        itemService.newItem(new Items(6, "Conditioner", 280));
        itemService.newItem(new Items(7, "Sunscreen", 350));
        itemService.newItem(new Items(8, "Moisturizer", 300));

        
        while (true) {
            System.out.println("Welcome to Walmart Shop");
            System.out.println("1. Shopping");
            System.out.println("2. Billing");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    List<Items> items = itemService.viewItems();
                    System.out.println("Available Items are:");
                    for (Items items2 : items) {
                        System.out.println(items2.getItemId() + " " + items2.getItemName() + "=" + items2.getItemPrice());
                    }
                    System.out.println("0 to stop");
                    System.out.println("Enter the items to add to your cart:");
                    while (true) {
                        int itemId = scanner.nextInt();
                        if (itemId == 0) {
                            break;
                        }
                        Items selectedId = itemService.findItemById(itemId);
                    if (selectedId!= null) {
                        System.out.println("Enter quantity:");
                        int quantity = scanner.nextInt();
                        billingService.addToCart(selectedId, quantity);
                        System.out.println(selectedId.getItemName() + " has been added to cart");
                    } 
                    
                    System.out.println("Enter the items to add to your cart:");
                    }
                    System.out.println("Thank you for shopping!");
                    break;

                    case 2: 
                    System.out.println("Billing and Printing Invoices");
                    // billingService.addToCart(null, choice);
                    // System.out.println("Items successfully added to the cart");
                    billingService.printInvoice();
                    
                case 3:
                    System.out.println("log out");

                default:
                  
                    break;
            }
        }
    }
}
