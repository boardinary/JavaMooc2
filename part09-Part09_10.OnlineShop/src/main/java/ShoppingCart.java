import java.util.*;

public class ShoppingCart {
    private Map<String, Item> cart;
    
    public ShoppingCart() {
        this.cart = new HashMap<>();
    }
    
    public void add(String product, int price) {
        // If item already in cart, add 1 more
        if (this.cart.containsKey(product)) {
            this.cart.get(product).increaseQuantity();
            return;
        }
        // Create new item in cart
        this.cart.put(product, new Item(product, 1 , price));
    }
    
    public int price() {
        int price = 0;
        for (Item item : this.cart.values()) {
            price += item.price();
        }
        return price;
    }
    
    public void print() {
        for (Item item : this.cart.values()) {
            System.out.println(item);
        }
    }
}

