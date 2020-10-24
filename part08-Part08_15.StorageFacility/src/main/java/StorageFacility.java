
import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> units;

    public StorageFacility() {
        this.units = new HashMap<>();
    }

    public void add(String unit, String item) {
        units.putIfAbsent(unit, new ArrayList<>());
        units.get(unit).add(item);
    }

    public ArrayList<String> contents(String unit) {
        units.putIfAbsent(unit, new ArrayList<>());
        return units.get(unit);
    }
    
    public void remove(String unit, String item) {
        units.get(unit).remove(item);
        
        if (units.get(unit).isEmpty()) {
            units.remove(unit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> list = new ArrayList<>();
        for (String unit : units.keySet()) {
            if (!units.get(unit).isEmpty()) {
                list.add(unit);
            }
        }
        return list;
    }
}
