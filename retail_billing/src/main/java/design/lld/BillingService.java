package design.lld;

import java.util.ArrayList;
import java.util.List;

public class BillingService {

    private List<cartItem> cart = new ArrayList<>();

public void addToCart(Items item, int quantity) {
    cartItem cartItem = new cartItem(item, quantity);
    cart.add(cartItem);
}

public void printInvoice() {
    if (cart == null || cart.isEmpty()) {
        System.out.println("Cart is empty!!! Add items to your cart!!");
        return;
    }

    double total = 0;
    System.out.println("Invoice of the Bill is:");

    for (cartItem cartItem : cart) {
        Items item = cartItem.getItems();
        int quantity = cartItem.getQuantity();
        double price = cartItem.totalPrice();

        System.out.println(item.getItemName() + " x" + quantity + " = Rs." + price);
        total += price;
    }

    System.out.println("The total amount to be paid: Rs." + total);
}

public boolean isCartEmpty() {
    return cart == null || cart.isEmpty();
}

        
    }

