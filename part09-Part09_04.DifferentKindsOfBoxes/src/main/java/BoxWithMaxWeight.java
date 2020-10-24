
import java.util.HashSet;

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private HashSet<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        items = new HashSet<>();
    }

    @Override
    public void add(Item item) {
        int weight = 0;
        for (Item i : items) {
            weight += i.getWeight();
        }
        
        if (weight + item.getWeight() > this.capacity) {
            return;
        }
        
        this.items.add(item);
    }
   
    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
