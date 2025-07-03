package design.lld;

public class cartItem {
    private Items items;
    private int quantity;

    public cartItem(Items items, int quantity) {
        this.items = items;
        this.quantity = quantity;
    }

    public Items getItems() {
        return items;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalPrice() {
        return items.getItemPrice() * quantity;
    }

   
}
