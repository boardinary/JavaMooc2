import java.util.*;
        
public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stock;
    
    public Warehouse() {
        this.prices = new HashMap<>();
        this.stock = new HashMap<>();
    }
    
    public void addProduct(String name, int price, int stock) {
        this.prices.put(name, price);
        this.stock.put(name, stock);
    }
    
    public int price(String product) {
        if (this.prices.containsKey(product)) {
            return this.prices.get(product);
        }
        return -99;
    }
    
    public int stock(String product) {
        return this.stock.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
        if (this.stock.containsKey(product)) {
            if (this.stock.get(product) > 0) {
                int oldStock = this.stock.get(product);
                this.stock.replace(product, oldStock - 1);
                return true;
            }
        }
        
        return false;
    }
    
    public Set<String> products() {
        return this.stock.keySet();
    }
}
