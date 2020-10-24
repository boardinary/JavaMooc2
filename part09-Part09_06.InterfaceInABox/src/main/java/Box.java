
import java.util.ArrayList;

public class Box implements Packable{

    private double maxWeight;
    private ArrayList<Packable> contents;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.contents = new ArrayList<>();
    }

    public void add(Packable packable) {

        if (packable.weight() + this.weight() <= this.maxWeight) {
            contents.add(packable);
        }
    }

    public double weight() {
        double weight = 0;
        for (Packable pack : this.contents) {
            weight += pack.weight();
        }
        
        return weight;
    }
    
    @Override
    public String toString() {
        return "Box: " + contents.size() + " items, total weight " +
                this.weight() + " kg";
    }

}
