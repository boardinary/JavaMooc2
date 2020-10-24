
package application;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;
    
    public AverageSensor() {
        sensors = new ArrayList<>();
        readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }
    
    public List<Integer> readings() {
        return this.readings;
    }
    
    @Override
    public boolean isOn() {
        return sensors.stream().noneMatch(sensor -> !sensor.isOn());
    }
    
    @Override
    public void setOn() {
        sensors.stream().forEach(sensor -> sensor.setOn());
    }
    
    @Override
    public void setOff() {
        sensors.stream().forEach(sensor -> sensor.setOff());
    }
    
    @Override
    public int read() {
        if (!isOn()) {
            throw new IllegalStateException("Sensors are off");
        }
        
        int average = (int) sensors.stream()
                .mapToInt(sensor -> sensor.read())
                .average()
                .orElseThrow(IllegalStateException::new);
        
        this.readings.add(average);
        return average;
    }
 }
