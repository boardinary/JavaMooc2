
import java.util.HashSet;

public class OneItemBox extends Box {

    private HashSet<Item> item;

    public OneItemBox() {
        this.item = new HashSet<>();
    }

    public void add(Item item) {
        if (this.item.isEmpty()) {
            this.item.add(item);
        }
    }

    public boolean isInBox(Item item) {
        return this.item.contains(item);
    }
}
