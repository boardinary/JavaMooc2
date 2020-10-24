
package application;

import java.util.Random;


public class TemperatureSensor implements Sensor {
    private int state; // On (1) Off (0)
    
    public TemperatureSensor() {
        this.state = 0;
    }
    
    @Override
    public boolean isOn() {
        return this.state == 1;
    }
    
    @Override
    public void setOn() {
        this.state = 1;
    }
    
    @Override
    public void setOff() {
        this.state = 0;
    }
    
    @Override
    public int read() {
        if (this.state == 0) {
            throw new IllegalStateException("Sensor is off, no reading");
        }        
        Random rand = new Random();        
        return rand.nextInt(60) - 30; // Returns rand num -30 < rand < 30
    }
}
