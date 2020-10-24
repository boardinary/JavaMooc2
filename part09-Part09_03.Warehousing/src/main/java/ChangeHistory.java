
import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    @Override
    public String toString() {
        return String.valueOf(this.history);
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double max = 0;
        for (int i = 0; i < this.history.size(); i++) {
            if (this.history.get(i) > max) {
                max = this.history.get(i);
            }
        }
        return max;
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double min = this.history.get(0);
        for (int i = 1; i < this.history.size(); i++) {
            if (this.history.get(i) < min) {
                min = this.history.get(i);
            }
        }
        return min;
    }
    
    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double sum = 0;
        int count = 0;
        for (double num : this.history) {
            sum += num;
            count++;
        }
        
        return sum / count;
    }
}
